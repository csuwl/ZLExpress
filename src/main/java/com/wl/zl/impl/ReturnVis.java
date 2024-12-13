package com.wl.zl.impl;

import com.wl.g4.ZLExpressParser;
import com.wl.model.Result;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * return expression
 * @author wanglei
 */
public class ReturnVis implements ICustomVisitor {
    @Override
    public Result visit(ParseTree tree, VisitProcess visitProcess) {
        ZLExpressParser.ReturnExpressionContext ctx = (ZLExpressParser.ReturnExpressionContext) tree;
        ParseTree child = ctx.getChild(1);
        return visitProcess.visitParseTree(child);
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.ReturnExpressionContext.class;
    }
}
