package com.csuwl.zl.impl;

import com.csuwl.g4.ZLExpressParser;
import com.csuwl.model.Result;
import com.csuwl.zl.ICustomVisitor;
import com.csuwl.zl.VisitProcess;
import org.antlr.v4.runtime.tree.ParseTree;

public class IntegerConstantVis implements ICustomVisitor {

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
