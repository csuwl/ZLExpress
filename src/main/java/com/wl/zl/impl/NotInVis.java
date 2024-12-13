package com.wl.zl.impl;

import com.wl.g4.ZLExpressParser;
import com.wl.model.Result;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

/**
 * notIn process
 * @author wanglei
 */
public class NotInVis implements ICustomVisitor {
    @Override
    public Result visit(ParseTree tree, VisitProcess visitProcess) {
        ZLExpressParser.InExpressionContext ctx = (ZLExpressParser.InExpressionContext) tree;
        Result result1 = visitProcess.visitParseTree(ctx.getChild(0));
        Result result2 = visitProcess.visitParseTree(ctx.getChild(3));
        if (result2.getResult() == null) {
            return new Result(null);
        }
        Object result2Value = result2.getResult();
        Object result1Value = result1.getResult();
        if (result2Value instanceof List) {
            List<Object> list = (List<Object>) result2Value;
            return new Result(!list.contains(result1Value));
        }
        return new Result(null);
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.NinExpressionContext.class;
    }
}
