package com.csuwl.zl.impl;

import com.csuwl.g4.ZLExpressParser;
import com.csuwl.model.Result;
import com.csuwl.zl.ICustomVisitor;
import com.csuwl.zl.VisitProcess;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * @author wanglei
 */
public class NumExpessVis implements ICustomVisitor {
    @Override
    public Result visit(ParseTree tree, VisitProcess visitProcess) {
        ZLExpressParser.NumExpressionContext ctx = (ZLExpressParser.NumExpressionContext) tree;
        TerminalNode minus = ctx.MINUS();

        Result result = visitProcess.visitParseTree(ctx.getChild(1));
        Object resultValue = result.getResult();
        if (resultValue instanceof Double) {
            Double res = (Double) resultValue;
            if(null != minus) {
                return new Result(-res);
            }
            return new Result(res);
        } else if (resultValue instanceof Integer) {
            Integer res = (Integer) resultValue;
            if(null != minus) {
                return new Result(-res);
            }
            return new Result(res);
        }

        throw new RuntimeException("不是数字，无法匹配正负号");
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.NumExpressionContext.class;
    }
}
