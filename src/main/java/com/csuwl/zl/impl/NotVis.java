package com.csuwl.zl.impl;

import com.csuwl.g4.ZLExpressParser;
import com.csuwl.model.Result;
import com.csuwl.zl.ICustomVisitor;
import com.csuwl.zl.VisitProcess;
import org.antlr.v4.runtime.tree.ParseTree;

import java.lang.reflect.InvocationTargetException;

/**
 * not process
 * @author wanglei
 */
public class NotVis implements ICustomVisitor {
    @Override
    public Result visit(ParseTree tree, VisitProcess visitProcess) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        ZLExpressParser.NotExpressionContext notExpression = (ZLExpressParser.NotExpressionContext) tree;
        Result result = visitProcess.visitParseTree(notExpression.getChild(1));
        if (null == result || null == result.getResult()) {
            return result ;
        }
        Boolean resultValue = (Boolean) result.getResult();

        return new Result(!resultValue);
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.NotExpressionContext.class;
    }
}
