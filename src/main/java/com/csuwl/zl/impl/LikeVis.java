package com.csuwl.zl.impl;

import com.csuwl.g4.ZLExpressParser;
import com.csuwl.model.Result;
import com.csuwl.zl.ICustomVisitor;
import com.csuwl.zl.VisitProcess;
import org.antlr.v4.runtime.tree.ParseTree;

import java.lang.reflect.InvocationTargetException;

/**
 * @author wanglei
 */
public class LikeVis implements ICustomVisitor {
    @Override
    public Result visit(ParseTree tree, VisitProcess visitProcess) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        ZLExpressParser.LikeContext ctx = (ZLExpressParser.LikeContext) tree;
        Result result1 = visitProcess.visitParseTree(ctx.getChild(0));
        Result result2 = visitProcess.visitParseTree(ctx.getChild(2));

        if (result1.getResult() instanceof String && result2.getResult() instanceof String) {
            String pattern = (String) result2.getResult();
            String source = (String) result1.getResult();
            pattern = pattern.replaceAll("%", ".*");
            pattern = pattern.replaceAll("_", ".");
            return new Result(source.matches(pattern));
        } else {
            throw new RuntimeException("like operator only support String type");
        }
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.LikeContext.class;
    }
}
