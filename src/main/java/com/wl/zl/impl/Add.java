package com.wl.zl.impl;

import com.wl.zl.ZLExpressBaseListener;
import com.wl.zl.ZLExpressBaseVisitor;
import com.wl.zl.ZLExpressLexer;
import com.wl.zl.ZLExpressParser;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public  class  Add<T> extends ZLExpressBaseVisitor<T> {

    @Override
    public T visitPlusExpression(ZLExpressParser.PlusExpressionContext ctx) {
        ParseTree one = ctx.getChild(0);
        CommonToken payloadOne = (CommonToken) one.getPayload();
        System.out.println(payloadOne.getType());
        if(ZLExpressLexer.IDENTIFIER==payloadOne.getType()){
            System.out.println("从上下文获取");
        }

        ParseTree operator = ctx.getChild(1);
        ParseTree two = ctx.getChild(2);

        String text = one.getText();
        System.out.println(ctx);

        return super.visitPlusExpression(ctx);
    }
}
