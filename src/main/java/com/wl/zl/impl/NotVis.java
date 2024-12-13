package com.wl.zl.impl;

import com.wl.g4.ZLExpressParser;
import com.wl.model.Result;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * not process
 * @author wanglei
 */
public class NotVis implements ICustomVisitor {
    @Override
    public Result visit(ParseTree tree, VisitProcess visitProcess) {
        ZLExpressParser.NotExpressionContext notExpression = (ZLExpressParser.NotExpressionContext) tree;
        Result result = visitProcess.visitParseTree(notExpression.getChild(1));
        if (null == result || null == result.getResult()) {
            return result ;
        }
        Boolean resultValue = (Boolean) result.getResult();

        return new Result(!resultValue);
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.NotExpressionContext.class;
    }
}
