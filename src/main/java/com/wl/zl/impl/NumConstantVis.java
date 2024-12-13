package com.wl.zl.impl;

import com.wl.g4.ZLExpressParser;
import com.wl.model.Result;
import org.antlr.v4.runtime.tree.ParseTree;

public class NumConstantVis implements ICustomVisitor{

    @Override
    public Result visit(ParseTree tree, VisitProcess visitProcess) {
        return visitProcess.visitChildren(tree);
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.NumConstantContext.class;
    }
}
