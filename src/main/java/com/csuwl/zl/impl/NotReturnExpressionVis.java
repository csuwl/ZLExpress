package com.csuwl.zl.impl;

import com.csuwl.g4.ZLExpressParser;
import com.csuwl.model.Result;
import com.csuwl.zl.ICustomVisitor;
import com.csuwl.zl.VisitProcess;
import org.antlr.v4.runtime.tree.ParseTree;

import java.lang.reflect.InvocationTargetException;

/**
 * not return expression
 * @author wanglei
 */
public class NotReturnExpressionVis implements ICustomVisitor {
    @Override
    public Result visit(ParseTree tree, VisitProcess visitProcess) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        return visitProcess.visitChildren(tree);
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.ExpressionNotReturnContext.class;
    }
}
