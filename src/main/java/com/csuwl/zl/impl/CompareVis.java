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

        Object result1Value = result1.getResult();
        Object result2Value = result2.getResult();
        if(null == result1Value && null == result2Value){
            return new Result(true);
        }
        if(null == result1Value || null == result2Value){
            return new Result(false);
        }
        switch (type) {
            case ZLExpressLexer.EQUALS:
                if (result1Value instanceof Number && result2Value instanceof Number) {
                    if (result1Value instanceof Integer && result2Value instanceof Integer) {
                        Integer res1 = (Integer) result1.getResult();
                        Integer res2 = (Integer) result2.getResult();
                        return new Result(res1.equals(res2));
                    } else if (result1Value instanceof Double && result2Value instanceof Double) {
                        Double res1 = (Double) result1.getResult();
                        Double res2 = (Double) result2.getResult();
                        return new Result(res1.equals(res2));
                    } else if (result1Value instanceof Integer && result2Value instanceof Double) {
                        Integer res1 = (Integer) result1.getResult();
                        Double res1Double = Double.valueOf(res1.toString());
                        Double res2 = (Double) result2.getResult();
                        return new Result(res1Double.equals(res2));
                    } else if (result1Value instanceof Double && result2Value instanceof Integer) {
                        Double res1 = (Double) result1.getResult();
                        Integer res2 = (Integer) result2.getResult();
                        Double res2Double = Double.valueOf(res2.toString());
                        return new Result(res1.equals(res2Double));
                    }
                }
                return new Result(result1.equals(result2));
            case ZLExpressLexer.NE:
                if (result1Value instanceof Number && result2Value instanceof Number) {
                    if (result1Value instanceof Integer && result2Value instanceof Integer) {
                        Integer res1 = (Integer) result1.getResult();
                        Integer res2 = (Integer) result2.getResult();
                        return new Result(!res1.equals(res2));
                    } else if (result1Value instanceof Double && result2Value instanceof Double) {
                        Double res1 = (Double) result1.getResult();
                        Double res2 = (Double) result2.getResult();
                        return new Result(!res1.equals(res2));
                    } else if (result1Value instanceof Integer && result2Value instanceof Double) {
                        Integer res1 = (Integer) result1.getResult();
                        Double res1Double = Double.valueOf(res1.toString());
                        Double res2 = (Double) result2.getResult();
                        return new Result(!res1Double.equals(res2));
                    } else if (result1Value instanceof Double && result2Value instanceof Integer) {
                        Double res1 = (Double) result1.getResult();
                        Integer res2 = (Integer) result2.getResult();
                        Double res2Double = Double.valueOf(res2.toString());
                        return new Result(!res1.equals(res2Double));
                    }
                }
                return new Result(!result1.equals(result2));
            case ZLExpressLexer.GE:
                if (result1Value instanceof Integer && result2Value instanceof Integer) {
                    return new Result((Integer) result1.getResult() >= (Integer) result2.getResult());
                } else if (result1Value instanceof Double && result2Value instanceof Double) {
                    return new Result((Double) result1.getResult() >= (Double) result2.getResult());
                } else if (result1Value instanceof Integer && result2Value instanceof Double) {
                    return new Result((Integer) result1.getResult() >= (Double) result2.getResult());
                } else if (result1Value instanceof Double && result2Value instanceof Integer) {
                    return new Result((Double) result1.getResult() >= (Integer) result2.getResult());
                } else {
                    return new Result(false);
                }
            case ZLExpressLexer.LE:
                if (result1Value instanceof Integer && result2Value instanceof Integer) {
                    return new Result((Integer) result1.getResult() <= (Integer) result2.getResult());
                } else if (result1Value instanceof Double && result2Value instanceof Double) {
                    return new Result((Double) result1.getResult() <= (Double) result2.getResult());
                } else if (result1Value instanceof Integer && result2Value instanceof Double) {
                    return new Result((Integer) result1.getResult() <= (Double) result2.getResult());
                } else if (result1Value instanceof Double && result2Value instanceof Integer) {
                    return new Result((Double) result1.getResult() <= (Integer) result2.getResult());
                } else {
                    return new Result(false);
                }
            case ZLExpressLexer.LT:
                if (result1Value instanceof Integer && result2Value instanceof Integer) {
                    return new Result((Integer) result1.getResult() < (Integer) result2.getResult());
                } else if (result1Value instanceof Double && result2Value instanceof Double) {
                    return new Result((Double) result1.getResult() < (Double) result2.getResult());
                } else if (result1Value instanceof Integer && result2Value instanceof Double) {
                    return new Result((Integer) result1.getResult() < (Double) result2.getResult());
                } else if (result1Value instanceof Double && result2Value instanceof Integer) {
                    return new Result((Double) result1.getResult() < (Integer) result2.getResult());
                } else {
                    return new Result(false);
                }
            case ZLExpressLexer.GT:
                if (result1Value instanceof Integer && result2Value instanceof Integer) {
                    return new Result((Integer) result1.getResult() > (Integer) result2.getResult());
                } else if (result1Value instanceof Double && result2Value instanceof Double) {
                    return new Result((Double) result1.getResult() > (Double) result2.getResult());
                } else if (result1Value instanceof Integer && result2Value instanceof Double) {
                    return new Result((Integer) result1.getResult() > (Double) result2.getResult());
                } else if (result1Value instanceof Double && result2Value instanceof Integer) {
                    return new Result((Double) result1.getResult() > (Integer) result2.getResult());
                } else {
                    return new Result(false);
                }
        }
        return new Result(false);
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.CompareExpressionContext.class;
    }
}
