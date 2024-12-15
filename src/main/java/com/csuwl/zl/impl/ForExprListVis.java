package com.csuwl.zl.impl;

import com.csuwl.g4.ZLExpressLexer;
import com.csuwl.g4.ZLExpressParser;
import com.csuwl.model.Result;
import com.csuwl.zl.ICustomVisitor;
import com.csuwl.zl.VisitProcess;
import org.antlr.v4.runtime.tree.ParseTree;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * for expression
 *
 * @author wanglei
 */
public class ForExprListVis implements ICustomVisitor {
    @Override
    public Result visit(ParseTree tree, VisitProcess visitProcess) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        ZLExpressParser.ForExprListContext ctx = (ZLExpressParser.ForExprListContext) tree;
        List<ZLExpressParser.ExpressionNotReturnContext> expressionNotReturnContexts = ctx.expressionNotReturn();
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

        ZLExpressParser.ReturnExpressionContext returnExpressionContext = ctx.returnExpression();
        if (null != returnExpressionContext) {
            result = visitProcess.visitParseTree(returnExpressionContext);
        }
        return null == result ? new Result(null) : result;
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.ForExprListContext.class;
    }
}
