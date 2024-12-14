package com.csuwl.zl.impl;

import com.csuwl.g4.ZLExpressParser;
import com.csuwl.model.Result;
import com.csuwl.zl.ICustomVisitor;
import com.csuwl.zl.VisitProcess;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * ++ process
 * @author wanglei
 */
public class PlusPlusVis implements ICustomVisitor {
    @Override
    public Result visit(ParseTree tree, VisitProcess visitProcess) {
        ZLExpressParser.PlusPlusExpressionContext ctx = (ZLExpressParser.PlusPlusExpressionContext) tree;
        Result result = visitProcess.visitParseTree(ctx.id());
        if (Integer.class.equals(result.getClazzType())) {
            result.setResult((Integer)result.getResult() + 1);
            putParentContext(tree,ctx.id().getText(),result.getResult());
            return result;
        }else if (Double.class.equals(result.getClazzType())) {
            result.setResult((Double)result.getResult() + 1);
            putParentContext(tree,ctx.id().getText(),result.getResult());
            return result;
        }
        throw new RuntimeException("++出错");
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.PlusPlusExpressionContext.class;
    }
}
