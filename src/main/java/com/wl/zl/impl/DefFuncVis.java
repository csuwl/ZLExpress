package com.wl.zl.impl;

import com.wl.g4.ZLExpressParser;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Arrays;
import java.util.List;

/**
 * 定义函数
 *
 * @author wanglei
 */
public class DefFuncVis implements ICustomVisitor<Void> {
    @Override
    public Void visit(ParseTree tree, VisitProcess visitProcess) {
        ZLExpressParser.DefFunctionContext ctx = (ZLExpressParser.DefFunctionContext) tree;
        String functionName = ctx.getChild(1).getText();
        ParseTree parameterList = ctx.getChild(3);

        Object functinListObject = resolveContext(tree, functionName);
        if (null == functinListObject) {
            putParentContext(tree, functionName, Arrays.asList(ctx));
        } else {
            if (functinListObject instanceof List) {
                List<ZLExpressParser.DefFunctionContext> funcList = (List<ZLExpressParser.DefFunctionContext>) functinListObject;
//                检查函数 参数个数 个数相同的去掉
                funcList.removeIf(defFunctionContext -> {
                    ParseTree parameterListFunc = defFunctionContext.getChild(3);
                    return parameterListFunc.getChildCount() == parameterList.getChildCount();
                });
                funcList.add(ctx);
            } else {
                putParentContext(tree, functionName, Arrays.asList(ctx));
            }
        }
        return null;
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.DefFunctionContext.class;
    }
}
