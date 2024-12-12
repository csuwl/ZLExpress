package com.wl.zl.impl;

import com.wl.g4.ZLExpressParser;
import com.wl.model.Result;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * return expression
 * @author wanglei
 */
public class ReturnVis implements ICustomVisitor<Object> {
    @Override
    public Object visit(ParseTree tree, VisitProcess visitProcess) {
        ZLExpressParser.ReturnExpressionContext ctx = (ZLExpressParser.ReturnExpressionContext) tree;
        ParseTree child = ctx.getChild(1);
        Result result = visitProcess.visitParseTree(child);
        return result.getResult();
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.ReturnExpressionContext.class;
    }
}
