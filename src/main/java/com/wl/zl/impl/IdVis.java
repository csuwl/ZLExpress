package com.wl.zl.impl;

import com.wl.g4.ZLExpressParser;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * return id value
 * @author wanglei
 */
public class IdVis implements ICustomVisitor<Object> {
    @Override
    public Object visit(ParseTree tree, VisitProcess visitProcess) {
        ZLExpressParser.IdContext idContext = (ZLExpressParser.IdContext) tree;
        String id = idContext.getText();
        return resolveContext(tree, id);
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.IdContext.class;
    }
}
