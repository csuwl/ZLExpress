package com.csuwl.zl.impl;

import com.csuwl.g4.ZLExpressParser;
import com.csuwl.model.Result;
import com.csuwl.zl.ICustomVisitor;
import com.csuwl.zl.VisitProcess;
import org.antlr.v4.runtime.tree.ParseTree;

public class GroupComputeVis implements ICustomVisitor {
    @Override
    public Result visit(ParseTree tree, VisitProcess visitProcess) {
        return visitProcess.visitParseTree(tree.getChild(1));
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.GroupComputeExpressionContext.class;
    }
}
