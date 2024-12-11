package com.wl.zl.impl;

import com.wl.g4.ZLExpressParser;
import org.antlr.v4.runtime.tree.ParseTree;

public class ExprListVis implements ICustomVisitor<Void> {
    @Override
    public Void visit(ParseTree tree, VisitProcess visitProcess) {
        visitProcess.visitChildren(tree);
        return null;
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.ExprListContext.class;
    }
}
