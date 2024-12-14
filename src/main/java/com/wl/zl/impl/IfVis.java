package com.wl.zl.impl;

import com.wl.g4.ZLExpressParser;
import com.wl.model.Result;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * if process
 *
 * @author wanglei
 */
public class IfVis implements ICustomVisitor {
    @Override
    public Result visit(ParseTree tree, VisitProcess visitProcess) {
        ZLExpressParser.IfContext ctx = (ZLExpressParser.IfContext) tree;
        ZLExpressParser.BooleanExpressionContext booleanExpressionContext = ctx.booleanExpression();
        ZLExpressParser.ElseContentContext elseContentContext = ctx.elseContent();

        if ((Boolean) visitProcess.visitParseTree(booleanExpressionContext).getResult()) {
            return visitProcess.visitParseTree(ctx.ifContent().exprList());
        } else if (null != elseContentContext) {
            return visitProcess.visitParseTree(elseContentContext.exprList());
        } else {
            return new Result(null);
        }
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.IfContext.class;
    }
}
