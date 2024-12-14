package com.wl.zl.impl;

import com.wl.g4.ZLExpressLexer;
import com.wl.g4.ZLExpressParser;
import com.wl.model.Result;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 * @author wanglei
 */
public class ContinueVis implements ICustomVisitor{
    @Override
    public Result visit(ParseTree tree, VisitProcess visitProcess) {
        return new Result(null, ZLExpressLexer.CONTINUE);
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.ContinueContext.class;
    }
}
