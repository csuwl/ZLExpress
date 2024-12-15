package com.csuwl.zl.impl;

import com.csuwl.g4.ZLExpressLexer;
import com.csuwl.g4.ZLExpressParser;
import com.csuwl.model.Result;
import com.csuwl.util.NumUtil;
import com.csuwl.zl.ICustomVisitor;
import com.csuwl.zl.VisitProcess;
import org.antlr.v4.runtime.tree.ParseTree;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.List;

/**
 * compare operator
 *
 * @author wanglei
 */
public class CompareVis implements ICustomVisitor {
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
                    return new Result(NumUtil.compareDoubleInteger((Number) result1Value, (Number) result2Value) == 0);
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
                    return new Result(NumUtil.compareDoubleInteger((Number) result1Value, (Number) result2Value) != 0);
                }
                return new Result(!result1.equals(result2));
            case ZLExpressLexer.GE:
                if (null == result1Value || null == result2Value) {
                    return new Result(false);
                }
                if (result1Value instanceof Number && result2Value instanceof Number) {
                    return new Result(NumUtil.compareDoubleInteger((Number) result1Value, (Number) result2Value) >= 0);
                } else {
                    return new Result(false);
                }
            case ZLExpressLexer.LE:
                if (null == result1Value || null == result2Value) {
                    return new Result(false);
                }
                if (result1Value instanceof Number && result2Value instanceof Number) {
                    return new Result(NumUtil.compareDoubleInteger((Number) result1Value, (Number) result2Value) <= 0);
                } else {
                    return new Result(false);
                }
            case ZLExpressLexer.LT:
                if (null == result1Value || null == result2Value) {
                    return new Result(false);
                }
                if (result1Value instanceof Number && result2Value instanceof Number) {
                    return new Result(NumUtil.compareDoubleInteger((Number) result1Value, (Number) result2Value) < 0);
                } else {
                    return new Result(false);
                }
            case ZLExpressLexer.GT:
                if (null == result1Value || null == result2Value) {
                    return new Result(false);
                }
                if (result1Value instanceof Number && result2Value instanceof Number) {
                    return new Result(NumUtil.compareDoubleInteger((Number) result1Value, (Number) result2Value) > 0);
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
