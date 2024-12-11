package com.wl.zl.impl;

import com.wl.g4.ZLExpressParser;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * 获取定义
 */
public class IdentifyVis implements ICustomVisitor<Object>{
    @Override
    public Object visit(ParseTree tree, VisitProcess visitProcess) {
        ZLExpressParser.IdentifierContext identifierContext = (ZLExpressParser.IdentifierContext)tree;
        String id = identifierContext.getText();
        return resolveContext(tree, id);
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.IdentifierContext.class;
    }
}
