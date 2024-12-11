package com.wl.zl.impl;


import com.wl.g4.ZLExpressParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Map;

/**
 * 赋值
 */
public class Assign implements ICustomVisitor<Object> {

    @Override
    public Object visit(ParseTree tree, VisitProcess<Object> visitProcess) {

        ParseTree parent1 = tree.getParent();
        System.out.println("parent getText:" + parent1.getText());
        System.out.println("parent getPayload:" + parent1.getPayload());

        visitProcess.visitChildren(tree);

        return null;
    }

    @Override
    public Class<? extends ParserRuleContext> getProcessType() {
        return ZLExpressParser.AssignExpressionContext.class;
    }
}
