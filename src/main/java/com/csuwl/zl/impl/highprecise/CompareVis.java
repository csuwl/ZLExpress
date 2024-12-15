package com.csuwl.zl.impl.highprecise;

import com.csuwl.g4.ZLExpressLexer;
import com.csuwl.g4.ZLExpressParser;
import com.csuwl.model.Result;
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
                return new Result(result1.equals(result2));
            case ZLExpressLexer.NE:
                return new Result(!result1.equals(result2));
            case ZLExpressLexer.GE:
                if (result1Value instanceof BigDecimal && result2Value instanceof BigDecimal) {
                    BigDecimal bigDecimal1 = (BigDecimal) result1.getResult();
                    BigDecimal bigDecimal2 = (BigDecimal) result2.getResult();
                    return new Result(bigDecimal1.compareTo(bigDecimal2) >= 0);
                } else {
                    return new Result(null);
                }
            case ZLExpressLexer.LE:
                if (result1Value instanceof BigDecimal && result2Value instanceof BigDecimal) {
                    BigDecimal bigDecimal1 = (BigDecimal) result1.getResult();
                    BigDecimal bigDecimal2 = (BigDecimal) result2.getResult();
                    return new Result(bigDecimal1.compareTo(bigDecimal2) <= 0);
                } else {
                    return new Result(null);
                }
            case ZLExpressLexer.LT:
                if (result1Value instanceof BigDecimal && result2Value instanceof BigDecimal) {
                    BigDecimal bigDecimal1 = (BigDecimal) result1.getResult();
                    BigDecimal bigDecimal2 = (BigDecimal) result2.getResult();
                    return new Result(bigDecimal1.compareTo(bigDecimal2) < 0);
                } else {
                    return new Result(null);
                }
            case ZLExpressLexer.GT:
                if (result1Value instanceof BigDecimal && result2Value instanceof BigDecimal) {
                    BigDecimal bigDecimal1 = (BigDecimal) result1.getResult();
                    BigDecimal bigDecimal2 = (BigDecimal) result2.getResult();
                    return new Result(bigDecimal1.compareTo(bigDecimal2) > 0);
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
