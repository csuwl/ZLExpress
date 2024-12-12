package com.wl.zl.impl;

import com.wl.g4.ZLExpressParser;
import com.wl.model.Result;
import org.antlr.v4.runtime.tree.ParseTree;

public class NotVis implements ICustomVisitor<Boolean> {
    @Override
    public Boolean visit(ParseTree tree, VisitProcess visitProcess) {
        ZLExpressParser.NotExpressionContext notExpression = (ZLExpressParser.NotExpressionContext) tree;
        Result result = visitProcess.visitParseTree(notExpression.getChild(1));
        if (null == result || null == result.getResult()) {
            return null;
        }
        Boolean resultValue = (Boolean) result.getResult();

        return !resultValue;
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.NotExpressionContext.class;
    }
}
