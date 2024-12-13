package com.wl.zl.impl;

import com.wl.g4.ZLExpressParser;
import com.wl.model.Result;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

/**
 * in array process
 *
 * @author wanglei
 */
public class InVis implements ICustomVisitor<Boolean> {
    @Override
    public Boolean visit(ParseTree tree, VisitProcess visitProcess) {
        ZLExpressParser.InExpressionContext ctx = (ZLExpressParser.InExpressionContext) tree;
        Result result1 = visitProcess.visitParseTree(ctx.getChild(0));
        Result result2 = visitProcess.visitParseTree(ctx.getChild(2));
        if (result2.getResult() == null) {
            return null;
        }
        Object result2Value = result2.getResult();
        Object result1Value = result1.getResult();
        if (result2Value instanceof List) {
            List<Object> list = (List<Object>) result2Value;
            return list.contains(result1Value);
        }
        return null;
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.InExpressionContext.class;
    }
}