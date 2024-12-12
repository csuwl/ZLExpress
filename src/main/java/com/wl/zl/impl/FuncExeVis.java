package com.wl.zl.impl;

import com.wl.g4.ZLExpressParser;
import com.wl.model.FunctionDefinition;
import com.wl.util.TypeUtil;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

/**
 * 函数执行
 *
 * @author wanglei1
 */
public class FuncExeVis implements ICustomVisitor<Object> {
    @Override
    public Object visit(ParseTree tree, VisitProcess visitProcess) {
        ZLExpressParser.FunctionExecuteContext ctx = (ZLExpressParser.FunctionExecuteContext) tree;
        String functionName = ctx.getChild(0).getText();
        List<ZLExpressParser.FunctionExecuteParameterListContext> functionExecuteParameterListContexts = ctx.getRuleContexts(ZLExpressParser.FunctionExecuteParameterListContext.class);
        ZLExpressParser.FunctionExecuteParameterListContext functionExecuteParameterListContext = functionExecuteParameterListContexts.get(0);
        List<ZLExpressParser.FunctionExecuteParameterContext> executeParameterItemList = functionExecuteParameterListContext.getRuleContexts(ZLExpressParser.FunctionExecuteParameterContext.class);

//      获取函数类型
        List<Integer> parameterTypes = new ArrayList<>(executeParameterItemList.size());
        List<Object> parameterValue = new ArrayList<>(executeParameterItemList.size());
        for (ZLExpressParser.FunctionExecuteParameterContext executeParameterItem : executeParameterItemList) {
            Result result = visitProcess.visitParseTree(executeParameterItem);
            parameterValue.add(result.getResult());
            parameterTypes.add(TypeUtil.getTypeByJavaClass(result.getClazz()));
        }
        FunctionDefinition functionDefinition = new FunctionDefinition(functionName, parameterTypes);

        List<ZLExpressParser.DefFunctionContext> functionContextList = resolveParentFunctionDefinition(ctx, functionDefinition);
        if (null == functionContextList || functionContextList.isEmpty()) {
//            todo 抛异常
            return null;
        } else {
            ZLExpressParser.DefFunctionContext defFunctionContext = functionContextList.get(0);


            List<ZLExpressParser.ExprListContext> exprListContexts = defFunctionContext.getRuleContexts(ZLExpressParser.ExprListContext.class);
            if (null == exprListContexts || exprListContexts.isEmpty()) {
                return null;
            } else {
                ZLExpressParser.ExprListContext exprListContext = exprListContexts.get(0);
                //            函数参数定义
                List<ZLExpressParser.FunctionParameterListContext> defParameterListContextList = defFunctionContext.getRuleContexts(ZLExpressParser.FunctionParameterListContext.class);
                ZLExpressParser.FunctionParameterListContext defFunctionParameterListContext = defParameterListContextList.get(0);
                List<ZLExpressParser.FunctionParameterItemContext> functionParameterItemContextList = defFunctionParameterListContext.getRuleContexts(ZLExpressParser.FunctionParameterItemContext.class);

                List<String> labels = new ArrayList<>(functionParameterItemContextList.size());
                for (ZLExpressParser.FunctionParameterItemContext functionParameterItemContext : functionParameterItemContextList) {
                    labels.add(functionParameterItemContext.getStop().getText());
                }
//                放到上下文
                for (int i = 0; i < parameterValue.size(); i++) {
                    exprListContext.getContext().put(labels.get(i), parameterValue.get(i));
                }
//               执行内容
                return visitProcess.visitParseTree(exprListContext);
            }
        }
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.FunctionExecuteContext.class;
    }
}
