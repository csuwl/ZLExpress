package com.csuwl.zl.impl;

import com.csuwl.g4.ZLExpressLexer;
import com.csuwl.g4.ZLExpressParser;
import com.csuwl.model.Result;
import com.csuwl.zl.ICustomVisitor;
import com.csuwl.zl.VisitProcess;
import org.antlr.v4.runtime.tree.ParseTree;

import java.lang.reflect.InvocationTargetException;

/**
 * process for
 *
 * @author wanglei
 */
public class ForContextVis implements ICustomVisitor {
    @Override
    public Result visit(ParseTree tree, VisitProcess visitProcess) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        ZLExpressParser.ForContext forContext = (ZLExpressParser.ForContext) tree;
        ZLExpressParser.ForExprListContext forExprListContext = forContext.forExprList();
        ZLExpressParser.AssignExpressionContext assignExpressionContext = forContext.assignExpression();
        ZLExpressParser.ComputeExpressionContext computeExpressionContext = forContext.computeExpression();
        ZLExpressParser.BooleanExpressionContext booleanExpressionContext = forContext.booleanExpression();
//        定义
        for (visitProcess.visitParseTree(assignExpressionContext); (Boolean) visitProcess.visitParseTree(booleanExpressionContext).getResult(); visitProcess.visitParseTree(computeExpressionContext)) {
            Result result = visitProcess.visitParseTree(forExprListContext);
            if (ZLExpressLexer.RETURN == result.getMessage()) {
                return result;
            } else if (ZLExpressLexer.BREAK == result.getMessage()) {
                result.setMessage(0);
                return result;
            } else if (ZLExpressLexer.CONTINUE == result.getMessage()) {
                result.setMessage(0);
                continue;
            }
        }

        return new Result(null);
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.ForContext.class;
    }
}
