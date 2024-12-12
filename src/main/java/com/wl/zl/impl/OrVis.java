package com.wl.zl.impl;

import com.wl.g4.ZLExpressParser;
import com.wl.model.Result;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * and operator process
 * @author wanglei
 */
public class OrVis implements ICustomVisitor<Boolean>{
    @Override
    public Boolean visit(ParseTree tree, VisitProcess visitProcess) {
        ZLExpressParser.AndExpressionContext ctx = (ZLExpressParser.AndExpressionContext)tree;
        ZLExpressParser.BooleanExpressionContext left = ctx.left;
        ZLExpressParser.BooleanExpressionContext right = ctx.right;
        Result result1 = visitProcess.visitParseTree(left);
        Result result2 = visitProcess.visitParseTree(right);
        Boolean result1Bool = (Boolean) result1.getResult();
        Boolean result2Bool = (Boolean) result2.getResult();
        return result1Bool || result2Bool;
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.AndExpressionContext.class;
    }
}

