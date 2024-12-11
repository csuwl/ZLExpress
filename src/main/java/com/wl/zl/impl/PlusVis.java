package com.wl.zl.impl;

import com.wl.g4.ZLExpressParser;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

public class PlusVis implements ICustomVisitor<Number> {

    @Override
    public Number visit(ParseTree tree, VisitProcess visitProcess) {
        ZLExpressParser.PlusExpressionContext ctx = (ZLExpressParser.PlusExpressionContext) tree;
        ctx
        ParseTree one = tree.getChild(0);
        CommonToken payloadOne = (CommonToken) one.getPayload();
        System.out.println(payloadOne.getType());
        if (ZLExpressParser.IDENTIFIER == payloadOne.getType()) {
            ParseTree parent = tree.getParent();
            System.out.println("从上下文获取");
        }

        ParseTree two = tree.getChild(2);

        String text = one.getText();
        System.out.println(text);


        visitProcess.visitChildren(tree);
        return null;
    }

    @Override
    public Class<? extends ParserRuleContext> getProcessType() {
        return ZLExpressParser.PlusExpressionContext.class;
    }


}
