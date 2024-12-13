package com.wl.zl.impl;


import com.wl.g4.ZLExpressLexer;
import com.wl.g4.ZLExpressParser;
import com.wl.model.Result;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;


/**
 * 赋值
 */
public class AssignVis implements ICustomVisitor {

    @Override
    public Result visit(ParseTree tree, VisitProcess visitProcess) {
        ZLExpressParser.AssignExpressionContext ctx = (ZLExpressParser.AssignExpressionContext) tree;

        int childCount = ctx.getChildCount();
        String symbel = null;
        Result result = null;
        Token typeToken = null;
        Object value = null;
        if (childCount == 3) {
            symbel = ctx.getStart().getText();
            result = visitProcess.visitParseTree(tree.getChild(2));
        } else if (childCount == 4) {
            typeToken = ctx.getStart();
            symbel = ctx.getChild(1).getText();
            result = visitProcess.visitParseTree(tree.getChild(3));
        }

        if (null != typeToken) {
            if (ZLExpressLexer.INT_TYPE == typeToken.getType()) {
                value = Integer.parseInt(result.getResult().toString());
            } else if (ZLExpressLexer.DOUBLE_TYPE == typeToken.getType()) {
                value = Double.parseDouble(result.getResult().toString());
            } else if (ZLExpressLexer.STRING_TYPE == typeToken.getType()) {
                value = result.getResult().toString();
            } else if (ZLExpressLexer.BOOL_TYPE == typeToken.getType()) {
                value = Boolean.parseBoolean(result.getResult().toString());
            }
        } else {
            value = result.getResult();
        }

        putParentContext(tree, symbel, value);
        return new Result(null);
    }

    @Override
    public Class<? extends ParserRuleContext> getProcessType() {
        return ZLExpressParser.AssignExpressionContext.class;
    }
}
