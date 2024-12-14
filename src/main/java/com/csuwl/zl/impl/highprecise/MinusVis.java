package com.csuwl.zl.impl.highprecise;

import com.csuwl.g4.ZLExpressParser;
import com.csuwl.model.Result;
import com.csuwl.zl.ICustomVisitor;
import com.csuwl.zl.IHighPreciseCustomVisitor;
import com.csuwl.zl.VisitProcess;
import org.antlr.v4.runtime.tree.ParseTree;

import java.math.BigDecimal;

/**
 * @author wanglei
 */
public class MinusVis implements IHighPreciseCustomVisitor {
    @Override
    public Result visit(ParseTree tree, VisitProcess visitProcess) {
        ZLExpressParser.MinusExpressionContext ctx = (ZLExpressParser.MinusExpressionContext) tree;
        ParseTree child1 = ctx.getChild(0);
        ParseTree child2 = ctx.getChild(2);
        Result result1 = visitProcess.visitParseTree(child1);
        Result result2 = visitProcess.visitParseTree(child2);
        if (null == result1 || null == result1.getResult() || null == result2 || null == result2.getResult()) {
            throw new RuntimeException("某个数为null,无法相加");
        }
        Object result1Value = result1.getResult();
        Object result2Value = result2.getResult();


        if (result1Value instanceof BigDecimal && result2Value instanceof BigDecimal) {
            BigDecimal res1 = (BigDecimal) result1Value;
            BigDecimal res2 = (BigDecimal) result2Value;
            return new Result(res1.subtract(res2));
        }

        throw new RuntimeException("不是数字，无法相减");
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.MinusExpressionContext.class;
    }
}
