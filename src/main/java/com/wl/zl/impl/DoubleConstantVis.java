package com.wl.zl.impl;

import com.wl.g4.ZLExpressParser;
import org.antlr.v4.runtime.tree.ParseTree;

import java.math.BigDecimal;

public class DoubleConstantVis implements ICustomVisitor<Double> {

    @Override
    public Double visit(ParseTree tree, VisitProcess visitProcess) {
        ZLExpressParser.DecimalConstantContext decimalConstantContext = (ZLExpressParser.DecimalConstantContext) tree;
        String text = decimalConstantContext.getText();
        return new Double(text);
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.DecimalConstantContext.class;
    }
}
