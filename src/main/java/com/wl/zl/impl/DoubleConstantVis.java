package com.wl.zl.impl;

import com.wl.g4.ZLExpressParser;
import org.antlr.v4.runtime.tree.ParseTree;

import java.math.BigDecimal;

public class DoubleConstantVis implements ICustomVisitor<BigDecimal> {

    @Override
    public BigDecimal visit(ParseTree tree, VisitProcess visitProcess) {
        ZLExpressParser.DecimalConstantContext decimalConstantContext = (ZLExpressParser.DecimalConstantContext) tree;
        String text = decimalConstantContext.getText();
        return new BigDecimal(text);
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.DecimalConstantContext.class;
    }
}
