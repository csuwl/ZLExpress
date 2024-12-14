package com.csuwl.zl.impl;

import com.csuwl.g4.ZLExpressParser;
import com.csuwl.model.Result;
import com.csuwl.zl.ICustomVisitor;
import com.csuwl.zl.VisitProcess;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * string value
 * @author wanglei
 */
public class StringQuotedVis implements ICustomVisitor {
    @Override
    public Result visit(ParseTree tree, VisitProcess visitProcess) {
        ZLExpressParser.StringQuotedContext ctx = (ZLExpressParser.StringQuotedContext) tree;
        String text = ctx.getText();
        return new Result(text.substring(1, text.length() - 1));
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.StringQuotedContext.class;
    }
}
