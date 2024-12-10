package com.wl.zl.impl;

import org.antlr.v4.runtime.ParserRuleContext;

public interface ICustomVisitor<T> {

    public Class<? extends ParserRuleContext> getProcessType();

    T visit(ParserRuleContext ctx, VisitProcess<T> tVisitProcess);

    default Object resolveContext(ParserRuleContext ctx){

        return null;
    };
}
