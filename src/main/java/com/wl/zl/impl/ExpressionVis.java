package com.wl.zl.impl;

import com.wl.g4.ZLExpressParser;
import com.wl.model.Result;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

public class ExpressionVis implements ICustomVisitor<Object>{

    @Override
    public Object visit(ParseTree tree, VisitProcess visitProcess) {
        Result result = visitProcess.visitChildren(tree);
        return result.getResult();
    }

    @Override
    public Class<? extends ParserRuleContext> getProcessType() {
        return ZLExpressParser.ExpressionContext.class;
    }
}
