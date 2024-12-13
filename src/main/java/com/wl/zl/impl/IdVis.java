package com.wl.zl.impl;

import com.wl.g4.ZLExpressParser;
import com.wl.model.Result;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * return id value
 * @author wanglei
 */
public class IdVis implements ICustomVisitor {
    @Override
    public Result visit(ParseTree tree, VisitProcess visitProcess) {
        ZLExpressParser.IdContext idContext = (ZLExpressParser.IdContext) tree;
        String id = idContext.getText();
        return new Result(resolveContext(tree, id));
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.IdContext.class;
    }
}
