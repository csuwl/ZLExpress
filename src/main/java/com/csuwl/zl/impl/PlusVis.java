package com.csuwl.zl.impl;

import com.csuwl.g4.ZLExpressParser;
import com.csuwl.model.Result;
import com.csuwl.zl.ICustomVisitor;
import com.csuwl.zl.VisitProcess;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * + operator
 *
 * @author wanglei
 */
public class PlusVis implements ICustomVisitor {

    @Override
    public Result visit(ParseTree tree, VisitProcess visitProcess) {
        ZLExpressParser.PlusExpressionContext ctx = (ZLExpressParser.PlusExpressionContext) tree;

        ParseTree child1 = ctx.getChild(0);
        ParseTree child2 = ctx.getChild(2);
        Result result1 = visitProcess.visitParseTree(child1);
        Result result2 = visitProcess.visitParseTree(child2);
        if (null == result1 || null == result1.getResult() || null == result2 || null == result2.getResult()) {
            throw new RuntimeException("某个数为null,无法相加");
        }

        Object result1Value = result1.getResult();
        Object result2Value = result2.getResult();

        if (result1Value instanceof Integer && result2Value instanceof Integer) {
            return new Result((Integer) result1Value + (Integer) result2Value);
        } else if (result1Value instanceof Double && result2Value instanceof Integer) {
            return new Result((Double) result1Value + (Integer) result2Value);
        } else if (result1Value instanceof Integer && result2Value instanceof Double) {
            return new Result((Integer) result1Value + (Double) result2Value);
        } else if (result1Value instanceof Double && result2Value instanceof Double) {
            return new Result((Double) result1Value + (Double) result2Value);
        }

        throw new RuntimeException("不是数字，无法相加");
    }

    @Override
    public Class<? extends ParserRuleContext> getProcessType() {
        return ZLExpressParser.PlusExpressionContext.class;
    }


}