package com.wl.zl.impl;

import com.wl.g4.ZLExpressParser;
import com.wl.model.Result;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

public class PlusVis implements ICustomVisitor<Number> {

    @Override
    public Number visit(ParseTree tree, VisitProcess visitProcess) {
        ZLExpressParser.PlusExpressionContext ctx = (ZLExpressParser.PlusExpressionContext) tree;

        ParseTree child1 = ctx.getChild(0);
        ParseTree child2 = ctx.getChild(2);
        Result result1 = visitProcess.visitParseTree(child1);
        Result result2 = visitProcess.visitParseTree(child2);
        if(null == result1 || null == result1.getResult() || null == result2 || null== result2.getResult()){
            return null;
        }

        if(result1.getClazzType().equals(Integer.class) && result2.getClazzType().equals(Integer.class)){
           return (Integer)result1.getResult() + (Integer) result2.getResult();
        } else if (result1.getClazzType().equals(Double.class) && result2.getClazzType().equals(Integer.class)) {
            return (Double) result1.getResult() + (Integer) result2.getResult();
        }else if (result1.getClazzType().equals(Integer.class) && result2.getClazzType().equals(Double.class)) {
            return (Integer) result1.getResult() + (Double) result2.getResult();
        } else if (result1.getClazzType().equals(Double.class) && result2.getClazzType().equals(Double.class)) {
            return (Double) result1.getResult() + (Double) result2.getResult();
        }

        return null;
    }

    @Override
    public Class<? extends ParserRuleContext> getProcessType() {
        return ZLExpressParser.PlusExpressionContext.class;
    }


}
