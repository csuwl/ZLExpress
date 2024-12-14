package com.csuwl.zl.impl;

import com.csuwl.g4.ZLExpressParser;
import com.csuwl.model.Result;
import com.csuwl.zl.ICustomVisitor;
import com.csuwl.zl.VisitProcess;
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
