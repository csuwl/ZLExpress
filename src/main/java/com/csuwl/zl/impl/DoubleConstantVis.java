package com.csuwl.zl.impl;

import com.csuwl.g4.ZLExpressParser;
import com.csuwl.model.Result;
import com.csuwl.zl.ICustomVisitor;
import com.csuwl.zl.VisitProcess;
import org.antlr.v4.runtime.tree.ParseTree;

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
