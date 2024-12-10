package com.wl.zl.impl;

import com.wl.zl.ZLExpressParser;
import org.antlr.v4.runtime.ParserRuleContext;

public class Constant implements ICustomVisitor<>{
    @Override
    public Class<? extends ParserRuleContext> getProcessType() {
        return null;
    }

    @Override
    public Object visit(ParserRuleContext ctx, VisitProcess visitProcess) {
        return ZLExpressParser.;
    }
}
