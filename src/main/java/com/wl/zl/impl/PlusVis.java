package com.wl.zl.impl;

import com.wl.g4.ZLExpressParser;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

public class PlusVis implements ICustomVisitor<Number> {

    @Override
    public Number visit(ParseTree tree, VisitProcess visitProcess) {
        ZLExpressParser.PlusExpressionContext ctx = (ZLExpressParser.PlusExpressionContext) tree;

        ParseTree child1 = ctx.getChild(0);
        ParseTree child2 = ctx.getChild(2);
        Object value1 = visitProcess.visitParseTree(child1);
        Object value2 = visitProcess.visitParseTree(child2);


        return null;
    }

    @Override
    public Class<? extends ParserRuleContext> getProcessType() {
        return ZLExpressParser.PlusExpressionContext.class;
    }


}
