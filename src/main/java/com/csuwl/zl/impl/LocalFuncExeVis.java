package com.csuwl.zl.impl;

import com.csuwl.g4.ZLExpressLexer;
import com.csuwl.g4.ZLExpressParser;
import com.csuwl.innerfunction.InnerFunctionPorcess;
import com.csuwl.model.FunctionDefinition;
import com.csuwl.model.InnerFunctionDefinition;
import com.csuwl.model.Result;
import com.csuwl.util.TypeUtil;
import com.csuwl.zl.ICustomVisitor;
import com.csuwl.zl.VisitProcess;
import org.antlr.v4.runtime.tree.ParseTree;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * 函数执行
 *
 * @author wanglei1
 */
public class LocalFuncExeVis implements ICustomVisitor {
    @Override
    public Result visit(ParseTree tree, VisitProcess visitProcess) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        ZLExpressParser.LocalFunctionExecuteContext ctx = (ZLExpressParser.LocalFunctionExecuteContext) tree;
        String functionName = ctx.getChild(0).getText();
        List<ZLExpressParser.FunctionExecuteParameterListContext> functionExecuteParameterListContexts = ctx.getRuleContexts(ZLExpressParser.FunctionExecuteParameterListContext.class);
        ZLExpressParser.FunctionExecuteParameterListContext functionExecuteParameterListContext = functionExecuteParameterListContexts.get(0);
        List<ZLExpressParser.FunctionExecuteParameterContext> executeParameterItemList = functionExecuteParameterListContext.getRuleContexts(ZLExpressParser.FunctionExecuteParameterContext.class);

//      获取函数类型
        List<Class> parameterClazzTypes = new ArrayList<>(executeParameterItemList.size());
        List<Integer> parameterTypes = new ArrayList<>(executeParameterItemList.size());
        List<Object> parameterValue = new ArrayList<>(executeParameterItemList.size());
        for (ZLExpressParser.FunctionExecuteParameterContext executeParameterItem : executeParameterItemList) {
            Result result = visitProcess.visitParseTree(executeParameterItem);
            parameterValue.add(result.getResult());
            parameterTypes.add(TypeUtil.getTypeByJavaClass(result.getClazzType()));
            parameterClazzTypes.add(result.getClazzType());
        }
        FunctionDefinition functionDefinition = new FunctionDefinition(functionName, parameterTypes);
        InnerFunctionDefinition innerFunctionDefinition = new InnerFunctionDefinition(functionName);

        List<ZLExpressParser.DefFunctionContext> functionContextList = resolveParentFunctionDefinition(ctx, functionDefinition);
        if (null == functionContextList || functionContextList.isEmpty()) {
//                查找内置函数
            return new Result(InnerFunctionPorcess.visit(innerFunctionDefinition,parameterValue));
        } else {
            ZLExpressParser.DefFunctionContext defFunctionContext = functionContextList.get(0);


            List<ZLExpressParser.ExprListContext> exprListContexts = defFunctionContext.getRuleContexts(ZLExpressParser.ExprListContext.class);
            if (null == exprListContexts || exprListContexts.isEmpty()) {
                return null;
            } else {
                //            函数参数定义
                ZLExpressParser.FunctionParameterListContext functionParameterListContext = defFunctionContext.functionParameterList();
                List<ZLExpressParser.FunctionParameterItemContext> functionParameterItemContextList = functionParameterListContext.getRuleContexts(ZLExpressParser.FunctionParameterItemContext.class);

                List<String> labels = new ArrayList<>(functionParameterItemContextList.size());
                for (ZLExpressParser.FunctionParameterItemContext functionParameterItemContext : functionParameterItemContextList) {
                    labels.add(functionParameterItemContext.getStop().getText());
                }
//                放到上下文
                ZLExpressParser.ExprListContext exprListContext = exprListContexts.get(0);
                for (int i = 0; i < parameterValue.size(); i++) {
                    exprListContext.getContext().put(labels.get(i), parameterValue.get(i));
                }
//               执行内容
                Result result = visitProcess.visitParseTree(exprListContext);
                result.setMessage(0);
//                函数返回类型是void的话 返回null
                if (ZLExpressLexer.VOID_TYPE == defFunctionContext.return_type().type().stop.getType()) {
                    return new Result(null);
                }
                return result;
            }
        }
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.LocalFunctionExecuteContext.class;
    }
}
