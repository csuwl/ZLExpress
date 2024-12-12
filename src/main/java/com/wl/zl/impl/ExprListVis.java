package com.wl.zl.impl;

import com.wl.g4.ZLExpressParser;
import com.wl.model.Result;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

public class ExprListVis implements ICustomVisitor<Object> {
    @Override
    public Object visit(ParseTree tree, VisitProcess visitProcess) {
        ZLExpressParser.ExprListContext exprList = (ZLExpressParser.ExprListContext) tree;
        List<ZLExpressParser.ExpressionContext> expresstionContextList = exprList.getRuleContexts(ZLExpressParser.ExpressionContext.class);
        if(null == expresstionContextList || expresstionContextList.isEmpty()){
            return null;
        }

        Result result = null;
        for (ZLExpressParser.ExpressionContext expressionContext : expresstionContextList) {
            result = visitProcess.visitParseTree(expressionContext);
        }
        return null == result ? null : result.getResult();
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.ExprListContext.class;
    }
}
