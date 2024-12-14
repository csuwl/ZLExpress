package com.csuwl.zl.impl;

import com.csuwl.g4.ZLExpressLexer;
import com.csuwl.g4.ZLExpressParser;
import com.csuwl.model.Result;
import com.csuwl.zl.ICustomVisitor;
import com.csuwl.zl.VisitProcess;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 * @author wanglei
 */
public class ContinueVis implements ICustomVisitor {
    @Override
    public Result visit(ParseTree tree, VisitProcess visitProcess) {
        return new Result(null, ZLExpressLexer.CONTINUE);
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.ContinueContext.class;
    }
}
