package com.csuwl.zl.impl;

import com.csuwl.g4.ZLExpressLexer;
import com.csuwl.g4.ZLExpressParser;
import com.csuwl.model.Result;
import com.csuwl.zl.ICustomVisitor;
import com.csuwl.zl.VisitProcess;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

/**
 * compare operator
 *
 * @author wanglei
 */
public class CompareVis implements ICustomVisitor {
    @Override
    public Result visit(ParseTree tree, VisitProcess visitProcess) {
        ZLExpressParser.CompareExpressionContext compareExpression = (ZLExpressParser.CompareExpressionContext) tree;
        Result result1 = visitProcess.visitParseTree(compareExpression.getChild(0));
        Result result2 = visitProcess.visitParseTree(compareExpression.getChild(2));

        List<ZLExpressParser.CompareContext> compareContexts = compareExpression.getRuleContexts(ZLExpressParser.CompareContext.class);
        ZLExpressParser.CompareContext compareContext = compareContexts.get(0);
        int type = compareContext.getStart().getType();
        Class clazz1 = result1.getClazzType();
        Class clazz2 = result2.getClazzType();
        switch (type) {
            case ZLExpressLexer.EQUALS:
                return new Result(result1.equals(result2));
            case ZLExpressLexer.NE:
                return new Result(!result1.equals(result2));
            case ZLExpressLexer.GE:
                if (Integer.class.equals(clazz1) && clazz1.equals(clazz2)) {
                    return new Result((Integer) result1.getResult() >= (Integer) result2.getResult());
                } else if (Double.class.equals(clazz1) && clazz1.equals(clazz2)) {
                    return new Result((Double) result1.getResult() >= (Double) result2.getResult());
                } else {
                    return new Result(null);
                }
            case ZLExpressLexer.LE:
                if (Integer.class.equals(clazz1) && clazz1.equals(clazz2)) {
                    return new Result((Integer) result1.getResult() <= (Integer) result2.getResult());
                } else if (Double.class.equals(clazz1) && clazz1.equals(clazz2)) {
                    return new Result((Double) result1.getResult() <= (Double) result2.getResult());
                } else {
                    return new Result(null);
                }
            case ZLExpressLexer.LT:
                if (Integer.class.equals(clazz1) && clazz1.equals(clazz2)) {
                    return new Result((Integer) result1.getResult() < (Integer) result2.getResult());
                } else if (Double.class.equals(clazz1) && clazz1.equals(clazz2)) {
                    return new Result((Double) result1.getResult() < (Double) result2.getResult());
                } else {
                    return new Result(null);
                }
            case ZLExpressLexer.GT:
                if (Integer.class.equals(clazz1) && clazz1.equals(clazz2)) {
                    return new Result((Integer) result1.getResult() > (Integer) result2.getResult());
                } else if (Double.class.equals(clazz1) && clazz1.equals(clazz2)) {
                    return new Result((Double) result1.getResult() > (Double) result2.getResult());
                } else {
                    return new Result(null);
                }
        }
        return new Result(null);
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.CompareExpressionContext.class;
    }
}
