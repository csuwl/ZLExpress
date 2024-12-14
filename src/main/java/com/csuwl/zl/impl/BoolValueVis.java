package com.csuwl.zl.impl;

import com.csuwl.g4.ZLExpressParser;
import com.csuwl.model.Result;
import com.csuwl.zl.ICustomVisitor;
import com.csuwl.zl.VisitProcess;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * bool value
 * @author wanglei
 */
public class BoolValueVis implements ICustomVisitor {
    @Override
    public Result visit(ParseTree tree, VisitProcess visitProcess) {
        ZLExpressParser.BoolValueExpressionContext ctx = (ZLExpressParser.BoolValueExpressionContext)tree;
        return new Result(Boolean.valueOf(ctx.BOOLEAN_VALUE().getText()));
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.BoolValueExpressionContext.class;
    }
}
