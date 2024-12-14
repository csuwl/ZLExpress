package com.csuwl.zl.impl;

import com.csuwl.g4.ZLExpressParser;
import com.csuwl.model.Result;
import com.csuwl.zl.ICustomVisitor;
import com.csuwl.zl.VisitProcess;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * + operator
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
        if(null == result1 || null == result1.getResult() || null == result2 || null== result2.getResult()){
            throw new RuntimeException("某个数为null,无法相加");
        }

        if(result1.getClazzType().equals(Integer.class) && result2.getClazzType().equals(Integer.class)){
           return new Result((Integer)result1.getResult() + (Integer) result2.getResult());
        } else if (result1.getClazzType().equals(Double.class) && result2.getClazzType().equals(Integer.class)) {
            return new Result((Double) result1.getResult() + (Integer) result2.getResult());
        }else if (result1.getClazzType().equals(Integer.class) && result2.getClazzType().equals(Double.class)) {
            return new Result((Integer) result1.getResult() + (Double) result2.getResult());
        } else if (result1.getClazzType().equals(Double.class) && result2.getClazzType().equals(Double.class)) {
            return new Result((Double) result1.getResult() + (Double) result2.getResult());
        }

        return new Result(null);
    }

    @Override
    public Class<? extends ParserRuleContext> getProcessType() {
        return ZLExpressParser.PlusExpressionContext.class;
    }


}
