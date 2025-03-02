package com.csuwl.zl.impl;

import com.csuwl.g4.ZLExpressParser;
import com.csuwl.model.FunctionDefinition;
import com.csuwl.model.Result;
import com.csuwl.zl.ICustomVisitor;
import com.csuwl.zl.VisitProcess;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 定义函数
 *
 * @author wanglei
 */
public class DefFuncVis implements ICustomVisitor {
    @Override
    public Result visit(ParseTree tree, VisitProcess visitProcess) {
        ZLExpressParser.DefFunctionContext ctx = (ZLExpressParser.DefFunctionContext) tree;
        String functionName = ctx.getChild(0).getText();
        List<ZLExpressParser.FunctionParameterListContext> parameterListContextList = ctx.getRuleContexts(ZLExpressParser.FunctionParameterListContext.class);
        ZLExpressParser.FunctionParameterListContext functionParameterListContext = parameterListContextList.get(0);
        List<ZLExpressParser.FunctionParameterItemContext> functionParameterItemContextList = functionParameterListContext.getRuleContexts(ZLExpressParser.FunctionParameterItemContext.class);
//      获取函数类型
        List<Integer> parameterTypes = new ArrayList<>(functionParameterItemContextList.size());
        for (ZLExpressParser.FunctionParameterItemContext functionParameterItem : functionParameterItemContextList) {
            parameterTypes.add(functionParameterItem.getStart().getType());
        }

        FunctionDefinition functionDefinition = new FunctionDefinition(functionName, parameterTypes);
//
        List<ZLExpressParser.DefFunctionContext> functionContextList = resolveParentFunctionDefinition(tree, functionDefinition);
        if (null == functionContextList || functionContextList.isEmpty()) {
            putParentFunctionDefinition(tree, functionDefinition, Arrays.asList(ctx));
        }
        return new Result(null);
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.DefFunctionContext.class;
    }
}
