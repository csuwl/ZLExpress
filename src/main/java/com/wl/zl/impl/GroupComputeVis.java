package com.wl.zl.impl;

import com.wl.g4.ZLExpressParser;
import com.wl.model.Result;
import org.antlr.v4.runtime.tree.ParseTree;

public class GroupComputeVis implements ICustomVisitor<Object>{
    @Override
    public Object visit(ParseTree tree, VisitProcess visitProcess) {
        Result result = visitProcess.visitParseTree(tree.getChild(1));
        return result.getResult();
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.GroupComputeExpressionContext.class;
    }
}
