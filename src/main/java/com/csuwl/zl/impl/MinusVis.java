package com.csuwl.zl.impl;

import com.csuwl.g4.ZLExpressParser;
import com.csuwl.model.Result;
import com.csuwl.util.NumUtil;
import com.csuwl.zl.ICustomVisitor;
import com.csuwl.zl.VisitProcess;
import org.antlr.v4.runtime.tree.ParseTree;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

/**
 * @author wanglei
 */
public class MinusVis implements ICustomVisitor {
    @Override
    public Result visit(ParseTree tree, VisitProcess visitProcess) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        ZLExpressParser.MinusExpressionContext ctx = (ZLExpressParser.MinusExpressionContext) tree;
        ParseTree child1 = ctx.getChild(0);
        ParseTree child2 = ctx.getChild(2);
        Result result1 = visitProcess.visitParseTree(child1);
        Result result2 = visitProcess.visitParseTree(child2);
        if (null == result1 || null == result1.getResult() || null == result2 || null == result2.getResult()) {
            throw new RuntimeException("某个数为null,无法相减");
        }
        Object result1Value = result1.getResult();
        Object result2Value = result2.getResult();

        if (!(result1Value instanceof Number) || !(result2Value instanceof Number)) {
            throw new RuntimeException("不是数字无法相减");
        }

        if (result1Value instanceof Integer && result2Value instanceof Integer) {
            return new Result((Integer) result1Value - (Integer) result2Value);
        } else if (result1Value instanceof Double && result2Value instanceof Integer) {
            return new Result((Double) result1Value - (Integer) result2Value);
        } else if (result1Value instanceof Integer && result2Value instanceof Double) {
            return new Result((Integer) result1Value - (Double) result2Value);
        } else if (result1Value instanceof Double && result2Value instanceof Double) {
            return new Result((Double) result1Value - (Double) result2Value);
        } else {
            BigDecimal res1 = NumUtil.toBigDecimal((Number) result1Value);
            BigDecimal res2 = NumUtil.toBigDecimal((Number) result2Value);
            return new Result(res1.subtract(res2));
        }

    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.MinusExpressionContext.class;
    }
}
