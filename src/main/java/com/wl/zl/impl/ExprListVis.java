package com.wl.zl.impl;

import com.wl.g4.ZLExpressParser;
import org.antlr.v4.runtime.tree.ParseTree;

public class ExprListVis implements ICustomVisitor<Object> {
    @Override
    public Object visit(ParseTree tree, VisitProcess visitProcess) {
        Result result = null;
        for (int i = 0; i < tree.getChildCount(); i++) {
            ParseTree child = tree.getChild(i);
            if (";".equals(child.getText())) {
                continue;
            }
            result = visitProcess.visitParseTree(child);
        }
        return result.getResult();
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.ExprListContext.class;
    }
}
