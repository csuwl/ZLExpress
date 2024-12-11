package com.wl.zl.impl;

import com.wl.g4.ZLExpressParser;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

public class Add<T> implements ICustomVisitor<T> {

    @Override
    public Class<? extends ParserRuleContext> getProcessType() {
        return ZLExpressParser.PlusExpressionContext.class;
    }

    @Override
    public T visit(ParseTree tree, VisitProcess<T> visitProcess) {
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
}
