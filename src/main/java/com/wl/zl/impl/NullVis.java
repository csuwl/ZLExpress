package com.wl.zl.impl;

import com.wl.g4.ZLExpressParser;
import com.wl.model.Result;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * return  null
 * @author wanglei
 */
public class NullVis implements ICustomVisitor{

    @Override
    public Result visit(ParseTree tree, VisitProcess visitProcess) {
        return new Result(null);
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.NullContext.class;
    }
}
