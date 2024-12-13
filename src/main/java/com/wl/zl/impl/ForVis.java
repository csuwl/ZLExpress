package com.wl.zl.impl;

import com.wl.g4.ZLExpressLexer;
import com.wl.g4.ZLExpressParser;
import com.wl.model.Result;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * process for
 * @author wanglei
 */
public class ForVis implements ICustomVisitor {
    @Override
    public Result visit(ParseTree tree, VisitProcess visitProcess) {
        ZLExpressParser.ForContext forContext = (ZLExpressParser.ForContext) tree;
        ZLExpressParser.ForExprListContext forExprListContext = forContext.forExprList();
        ZLExpressParser.AssignExpressionContext assignExpressionContext = forContext.assignExpression();
        ZLExpressParser.ComputeExpressionContext computeExpressionContext = forContext.computeExpression();
        ZLExpressParser.BooleanExpressionContext booleanExpressionContext = forContext.booleanExpression();
//        定义
        for(visitProcess.visitParseTree(assignExpressionContext); (Boolean) visitProcess.visitParseTree(booleanExpressionContext).getResult();visitProcess.visitParseTree(computeExpressionContext)){
            Result result = visitProcess.visitParseTree(forExprListContext);
            if(ZLExpressLexer.RETURN==result.getMessage()){
                return result;
            }
        }

        return new Result(null);
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.ForContext.class;
    }
}
