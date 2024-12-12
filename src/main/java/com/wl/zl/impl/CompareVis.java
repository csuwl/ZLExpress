package com.wl.zl.impl;

import com.wl.g4.ZLExpressLexer;
import com.wl.g4.ZLExpressParser;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

/**
 * compare operator
 *
 * @author wanglei
 */
public class CompareVis implements ICustomVisitor<Boolean> {
    @Override
    public Boolean visit(ParseTree tree, VisitProcess visitProcess) {
        ZLExpressParser.CompareExpressionContext compareExpression = (ZLExpressParser.CompareExpressionContext) tree;
        Result result1 = visitProcess.visitParseTree(compareExpression.getChild(0));
        Result result2 = visitProcess.visitParseTree(compareExpression.getChild(2));

        List<ZLExpressParser.CompareContext> compareContexts = compareExpression.getRuleContexts(ZLExpressParser.CompareContext.class);
        ZLExpressParser.CompareContext compareContext = compareContexts.get(0);
        int type = compareContext.getStart().getType();
        Class clazz1 = result1.getClazz();
        Class clazz2 = result2.getClazz();
        switch (type) {
            case ZLExpressLexer.EQUALS:
                return result1.equals(result2);
            case ZLExpressLexer.GE:
                if (clazz1.equals(clazz2) && clazz1.equals(Integer.class)) {
                    return (Integer) result1.getResult() >= (Integer) result2.getResult();
                } else if (clazz1.equals(clazz2) && clazz1.equals(Double.class)) {
                    return (Double) result1.getResult() >= (Double) result2.getResult();
                } else {
                    return false;
                }
            case ZLExpressLexer.LE:
                if (clazz1.equals(clazz2) && clazz1.equals(Integer.class)) {
                    return (Integer) result1.getResult() <= (Integer) result2.getResult();
                } else if (clazz1.equals(clazz2) && clazz1.equals(Double.class)) {
                    return (Double) result1.getResult() <= (Double) result2.getResult();
                } else {
                    return false;
                }
            case ZLExpressLexer.LT:
                if (clazz1.equals(clazz2) && clazz1.equals(Integer.class)) {
                    return (Integer) result1.getResult() < (Integer) result2.getResult();
                } else if (clazz1.equals(clazz2) && clazz1.equals(Double.class)) {
                    return (Double) result1.getResult() < (Double) result2.getResult();
                } else {
                    return false;
                }
            case ZLExpressLexer.GT:
                if (clazz1.equals(clazz2) && clazz1.equals(Integer.class)) {
                    return (Integer) result1.getResult() > (Integer) result2.getResult();
                } else if (clazz1.equals(clazz2) && clazz1.equals(Double.class)) {
                    return (Double) result1.getResult() > (Double) result2.getResult();
                } else {
                    return false;
                }
        }
        return null;
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.CompareExpressionContext.class;
    }
}
