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
 * expression top level
 *
 * @author wanglei
 */
public class ExprListVis implements ICustomVisitor {
    @Override
    public Result visit(ParseTree tree, VisitProcess visitProcess) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
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
