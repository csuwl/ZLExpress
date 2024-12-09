package com.wl.zl.impl;

import com.wl.zl.ZLExpressBaseVisitor;
import com.wl.zl.ZLExpressParser;

public class Assign<T> extends ZLExpressBaseVisitor<T> {

    @Override
    public T visitAssigExpression(ZLExpressParser.AssigExpressionContext ctx) {
        ctx.parent.
        return super.visitAssigExpression(ctx);
    }
}
