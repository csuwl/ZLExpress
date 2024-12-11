package com.wl.zl.impl;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

public interface ICustomVisitor<T> {

    T visit(ParseTree tree, VisitProcess<T> tVisitProcess);

    public Class<? extends ParseTree> getProcessType();


    default Object resolveContext(ParserRuleContext ctx){

        return null;
    };
}
