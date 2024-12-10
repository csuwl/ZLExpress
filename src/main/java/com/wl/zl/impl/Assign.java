package com.wl.zl.impl;


import com.wl.g4.ZLExpressParser;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.Map;

/**
 * 赋值
 */
public class Assign implements ICustomVisitor<Object> {

    @Override
    public Class<? extends ParserRuleContext> getProcessType() {
        return ZLExpressParser.AssignExpressionContext.class;
    }

    @Override
    public Object visit(ParserRuleContext ctx, VisitProcess<Object> visitProcess) {
        ZLExpressParser.ExpressionContext parent = (ZLExpressParser.ExpressionContext) ctx.getParent();
        Map<Object, Object> map = parent.context;
        if(null==map || map.isEmpty()){

        }
        Object label = visitProcess.visit(ctx.getChild(0));
        Object value = visitProcess.visit(ctx.getChild(2));

        map.put((String) label, value);
        System.out.println("赋值：" + label + ":" + value);
        return null;
    }
}
