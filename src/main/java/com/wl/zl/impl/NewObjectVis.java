package com.wl.zl.impl;

import com.wl.g4.ZLExpressParser;
import org.antlr.v4.runtime.tree.ParseTree;

public class NewObjectVis implements ICustomVisitor<Void>{
    @Override
    public Void visit(ParseTree tree, VisitProcess visitProcess) {
        ZLExpressParser.NewObjectExpressionContext ctx = (ZLExpressParser.NewObjectExpressionContext) tree;

        return null;
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.NewObjectExpressionContext.class;
    }
}
