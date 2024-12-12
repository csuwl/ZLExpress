package com.wl.zl.impl;

import org.antlr.v4.runtime.tree.ParseTree;

/**
 * in array process
 * @author wanglei
 */
public class InVis implements ICustomVisitor<Boolean> {
    @Override
    public Boolean visit(ParseTree tree, VisitProcess visitProcess) {
        return null;
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return null;
    }
}
