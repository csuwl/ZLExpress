package com.wl.zl.impl;

import com.wl.g4.ZLExpressLexer;
import com.wl.g4.ZLExpressParser;
import com.wl.model.Result;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

/**
 * expression top level
 *
 * @author wanglei
 */
public class ExprListVis implements ICustomVisitor {
    @Override
    public Result visit(ParseTree tree, VisitProcess visitProcess) {
        ZLExpressParser.ExprListContext exprList = (ZLExpressParser.ExprListContext) tree;
        List<ZLExpressParser.ExpressionNotReturnContext> expressionNotReturnContexts = exprList.expressionNotReturn();
        Result result = null;
        for (ZLExpressParser.ExpressionNotReturnContext expressionNotReturnContext : expressionNotReturnContexts) {
            result = visitProcess.visitParseTree(expressionNotReturnContext);
            if (ZLExpressLexer.RETURN == result.getMessage()) {
                return result;
            } else if (ZLExpressLexer.BREAK == result.getMessage()) {
                return result;
            } else if (ZLExpressLexer.CONTINUE == result.getMessage()) {
                return result;
            }
        }

        ZLExpressParser.ReturnExpressionContext returnExpressionContext = exprList.returnExpression();
        if (null != returnExpressionContext) {
            result = visitProcess.visitParseTree(returnExpressionContext);
        }
        return null == result ? new Result(null) : result;
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.ExprListContext.class;
    }
}
