package com.wl.zl.impl;

import com.wl.g4.ZLExpressParser;
import org.antlr.v4.runtime.tree.ParseTree;

public class IntegerConstantVis implements ICustomVisitor<Integer>{

    @Override
    public Integer visit(ParseTree tree, VisitProcess visitProcess) {
        ZLExpressParser.IntegerConstantContext integerConstantContext = (ZLExpressParser.IntegerConstantContext)tree;
        String text = integerConstantContext.getText();
        return Integer.parseInt(text);
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.IntegerConstantContext.class;
    }
}
