package com.wl.zl.impl;


import com.wl.zl.ZLExpressParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Map;
import java.util.Objects;

/**
 * 赋值
 */
public class Assign implements ICustomVisitor<Object> {

    @Override
    public Class<? extends ParserRuleContext> getProcessType() {
        return ZLExpressParser.AssigExpressionContext.class;
    }

    @Override
    public Object visit(ParserRuleContext ctx, VisitProcess<Object> visitProcess) {
        ZLExpressParser.ExpressionContext parent = (ZLExpressParser.ExpressionContext) ctx.getParent();
        Map<String, Object> map = parent.getMap();
        Object label = visitProcess.visit(ctx.getChild(0));
        Object value = visitProcess.visit(ctx.getChild(2));

        map.put((String) label, value);
        System.out.println("赋值：" + label + ":" + value);
        return null;
    }
}
