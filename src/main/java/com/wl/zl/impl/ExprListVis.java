package com.wl.zl.impl;

import com.wl.g4.ZLExpressParser;
import com.wl.model.Result;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

public class ExprListVis implements ICustomVisitor<Object> {
    @Override
    public Object visit(ParseTree tree, VisitProcess visitProcess) {
        ZLExpressParser.ExprListContext exprList = (ZLExpressParser.ExprListContext) tree;
        List<ZLExpressParser.ExpressionNotReturnContext> expressionNotReturnContexts = exprList.expressionNotReturn();
        Result result=null;
        for(ZLExpressParser.ExpressionNotReturnContext expressionNotReturnContext: expressionNotReturnContexts){
            result = visitProcess.visitParseTree(expressionNotReturnContext);
        }

        ZLExpressParser.ReturnExpressionContext returnExpressionContext = exprList.returnExpression();
        if(null != returnExpressionContext){
            result = visitProcess.visitParseTree(returnExpressionContext);
        }
        return null == result ? null : result.getResult();
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.ExprListContext.class;
    }
}
