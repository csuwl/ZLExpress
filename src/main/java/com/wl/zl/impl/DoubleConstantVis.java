package com.wl.zl.impl;

import com.wl.g4.ZLExpressParser;
import com.wl.model.Result;
import org.antlr.v4.runtime.tree.ParseTree;

import java.math.BigDecimal;

public class DoubleConstantVis implements ICustomVisitor {

    @Override
    public Result visit(ParseTree tree, VisitProcess visitProcess) {
        ZLExpressParser.DecimalConstantContext decimalConstantContext = (ZLExpressParser.DecimalConstantContext) tree;
        String text = decimalConstantContext.getText();
        return new Result(Double.parseDouble(text));
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.DecimalConstantContext.class;
    }
}
