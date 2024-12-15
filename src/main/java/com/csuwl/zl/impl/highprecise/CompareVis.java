package com.csuwl.zl.impl.highprecise;

import com.csuwl.g4.ZLExpressLexer;
import com.csuwl.g4.ZLExpressParser;
import com.csuwl.model.Result;
import com.csuwl.util.NumUtil;
import com.csuwl.zl.ICustomVisitor;
import com.csuwl.zl.IHighPreciseCustomVisitor;
import com.csuwl.zl.VisitProcess;
import org.antlr.v4.runtime.tree.ParseTree;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

/**
 * compare operator
 *
 * @author wanglei
 */
public class CompareVis implements IHighPreciseCustomVisitor {
    @Override
    public Result visit(ParseTree tree, VisitProcess visitProcess) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        ZLExpressParser.CompareExpressionContext compareExpression = (ZLExpressParser.CompareExpressionContext) tree;
        Result result1 = visitProcess.visitParseTree(compareExpression.getChild(0));
        Result result2 = visitProcess.visitParseTree(compareExpression.getChild(2));

        List<ZLExpressParser.CompareContext> compareContexts = compareExpression.getRuleContexts(ZLExpressParser.CompareContext.class);
        ZLExpressParser.CompareContext compareContext = compareContexts.get(0);
        int type = compareContext.getStart().getType();

        Object result1Value = result1.getResult();
        Object result2Value = result2.getResult();
        switch (type) {
            case ZLExpressLexer.EQUALS:
                if (null == result1Value && null == result2Value) {
                    return new Result(true);
                }
                if(null == result1Value || null == result2Value) {
                    return new Result(false);
                }

                if (result1Value instanceof Number && result2Value instanceof Number) {
                    BigDecimal res1 = NumUtil.toBigDecimal((Number) result1Value);
                    BigDecimal res2 = NumUtil.toBigDecimal((Number) result2Value);
                    return new Result(res1.equals(res2));
                }
                return new Result(result1.equals(result2));
            case ZLExpressLexer.NE:
                if (null == result1Value && null == result2Value) {
                    return new Result(false);
                }
                if(null == result1Value || null == result2Value) {
                    return new Result(true);
                }
                if (result1Value instanceof Number && result2Value instanceof Number) {
                    BigDecimal res1 = NumUtil.toBigDecimal((Number) result1Value);
                    BigDecimal res2 = NumUtil.toBigDecimal((Number) result2Value);
                    return new Result(!res1.equals(res2));
                }
                return new Result(!result1.equals(result2));
            case ZLExpressLexer.GE:
                if (null == result1Value || null == result2Value) {
                    return new Result(false);
                }

                BigDecimal res1 = null;
                BigDecimal res2 = null;
                if (result1Value instanceof BigDecimal) {
                    res1 = (BigDecimal) result1Value;
                } else {
                    res1 = NumUtil.toBigDecimal((BigDecimal) result1Value);
                }

                if (result2Value instanceof BigDecimal) {
                    res2 = (BigDecimal) result2Value;
                } else {
                    res2 = NumUtil.toBigDecimal((BigDecimal) result2Value);
                }
                return new Result(res1.compareTo(res2) >= 0);
            case ZLExpressLexer.LE:
                if (null == result1Value || null == result2Value) {
                    return new Result(false);
                }

                BigDecimal ress1 = null;
                BigDecimal ress2 = null;
                if (result1Value instanceof BigDecimal) {
                    ress1 = (BigDecimal) result1Value;
                } else {
                    ress1 = NumUtil.toBigDecimal((BigDecimal) result1Value);
                }

                if (result2Value instanceof BigDecimal) {
                    ress2 = (BigDecimal) result2Value;
                } else {
                    ress2 = NumUtil.toBigDecimal((BigDecimal) result2Value);
                }
                return new Result(ress1.compareTo(ress2) <= 0);
            case ZLExpressLexer.LT:
                if (null == result1Value || null == result2Value) {
                    return new Result(false);
                }

                BigDecimal resss1 = null;
                BigDecimal resss2 = null;
                if (result1Value instanceof BigDecimal) {
                    resss1 = (BigDecimal) result1Value;
                } else {
                    resss1 = NumUtil.toBigDecimal((BigDecimal) result1Value);
                }

                if (result2Value instanceof BigDecimal) {
                    resss2 = (BigDecimal) result2Value;
                } else {
                    resss2 = NumUtil.toBigDecimal((BigDecimal) result2Value);
                }
                return new Result(resss1.compareTo(resss2) < 0);
            case ZLExpressLexer.GT:
                if (null == result1Value || null == result2Value) {
                    return new Result(false);
                }

                BigDecimal ressss1 = null;
                BigDecimal ressss2 = null;
                if (result1Value instanceof BigDecimal) {
                    ressss1 = (BigDecimal) result1Value;
                } else {
                    ressss1 = NumUtil.toBigDecimal((BigDecimal) result1Value);
                }

                if (result2Value instanceof BigDecimal) {
                    ressss2 = (BigDecimal) result2Value;
                } else {
                    ressss2 = NumUtil.toBigDecimal((BigDecimal) result2Value);
                }
                return new Result(ressss1.compareTo(ressss2) > 0);
        }
        return new Result(false);
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.CompareExpressionContext.class;
    }
}
