package com.csuwl.zl.impl;

import com.csuwl.g4.ZLExpressParser;
import com.csuwl.model.Result;
import com.csuwl.zl.ICustomVisitor;
import com.csuwl.zl.VisitProcess;
import org.antlr.v4.runtime.tree.ParseTree;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * notIn process
 * @author wanglei
 */
public class NotInVis implements ICustomVisitor {
    @Override
    public Result visit(ParseTree tree, VisitProcess visitProcess) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
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
