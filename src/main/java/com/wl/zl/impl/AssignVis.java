package com.wl.zl.impl;


import com.wl.g4.ZLExpressParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;


/**
 * 赋值
 */
public class AssignVis implements ICustomVisitor<Void> {

    @Override
    public Void visit(ParseTree tree, VisitProcess visitProcess) {
        ZLExpressParser.AssignExpressionContext ctx = (ZLExpressParser.AssignExpressionContext) tree;

        String symbel = ctx.getStart().getText();
        Object value = visitProcess.visitParseTree(tree.getChild(2));
        System.out.println(symbel + " = " + value);
        putGloable(tree, symbel, value);

        return null;
    }

    @Override
    public Class<? extends ParserRuleContext> getProcessType() {
        return ZLExpressParser.AssignExpressionContext.class;
    }
}
