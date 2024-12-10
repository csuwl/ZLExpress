package com.wl.zl.impl;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.List;

public class VisitProcess<T> extends ZLExpressBaseVisitor<T> {

    private List<ICustomVisitor<T>> visitorList = new ArrayList<ICustomVisitor<T>>();

    public VisitProcess(List<ICustomVisitor<T>> visitorList) {
        this.visitorList = visitorList;
    }

    public T visit(ParserRuleContext ctx) {
        for (ICustomVisitor<T> visitor : this.visitorList) {
            Class<? extends ParserRuleContext> processType = visitor.getProcessType();
            if (processType.isInstance(ctx)) {
                return visitor.visit(ctx,this);
            }
        }
        return null;
    }


}
