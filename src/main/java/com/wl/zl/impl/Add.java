package com.wl.zl.impl;

import com.wl.zl.*;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

public class Add<T> implements ICustomVisitor<T> {

    @Override
    public Class<? extends ParserRuleContext> getProcessType() {
        return ZLExpressParser.PlusExpressionContext.class;
    }

    @Override
    public T visit(ParserRuleContext ctx, VisitProcess<T> tVisitProcess) {
        ParseTree one = ctx.getChild(0);
        CommonToken payloadOne = (CommonToken) one.getPayload();
        System.out.println(payloadOne.getType());
        if (ZLExpressLexer.IDENTIFIER == payloadOne.getType()) {
            ParserRuleContext parent = ctx.getParent();
            System.out.println("从上下文获取");
        }

        ParseTree two = ctx.getChild(2);

        String text = one.getText();
        System.out.println(ctx);

        return null;
    }
}
