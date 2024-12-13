package com.wl.zl.impl;

import com.wl.g4.ZLExpressParser;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * return  null
 * @author wanglei
 */
public class NullVis implements ICustomVisitor<Object>{

    @Override
    public Object visit(ParseTree tree, VisitProcess visitProcess) {
        return null;
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.NullContext.class;
    }
}
