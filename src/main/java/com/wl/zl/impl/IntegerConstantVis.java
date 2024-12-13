package com.wl.zl.impl;

import com.wl.g4.ZLExpressParser;
import com.wl.model.Result;
import org.antlr.v4.runtime.tree.ParseTree;

public class IntegerConstantVis implements ICustomVisitor{

    @Override
    public Result visit(ParseTree tree, VisitProcess visitProcess) {
        ZLExpressParser.IntegerConstantContext integerConstantContext = (ZLExpressParser.IntegerConstantContext)tree;
        String text = integerConstantContext.getText();
        return new Result(Integer.parseInt(text));
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.IntegerConstantContext.class;
    }
}
