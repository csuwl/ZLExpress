package com.csuwl.zl.impl;

import com.csuwl.g4.ZLExpressLexer;
import com.csuwl.g4.ZLExpressParser;
import com.csuwl.model.Result;
import com.csuwl.zl.ICustomVisitor;
import com.csuwl.zl.VisitProcess;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * return expression
 * @author wanglei
 */
public class ReturnVis implements ICustomVisitor {
    @Override
    public Result visit(ParseTree tree, VisitProcess visitProcess) {
        ZLExpressParser.ReturnExpressionContext ctx = (ZLExpressParser.ReturnExpressionContext) tree;
        ParseTree child = ctx.getChild(1);
        Result result = visitProcess.visitParseTree(child);
//        set return flag
        result.setMessage(ZLExpressLexer.RETURN);
        return result;
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.ReturnExpressionContext.class;
    }
}
