package com.csuwl.zl.impl.highprecise;

import com.csuwl.g4.ZLExpressParser;
import com.csuwl.model.Result;
import com.csuwl.zl.ICustomVisitor;
import com.csuwl.zl.IHighPreciseCustomVisitor;
import com.csuwl.zl.VisitProcess;
import org.antlr.v4.runtime.tree.ParseTree;

import java.math.BigDecimal;

/**
 * ++ process
 * @author wanglei
 */
public class PlusPlusVis implements IHighPreciseCustomVisitor {
    @Override
    public Result visit(ParseTree tree, VisitProcess visitProcess) {
        ZLExpressParser.PlusPlusExpressionContext ctx = (ZLExpressParser.PlusPlusExpressionContext) tree;
        Result result = visitProcess.visitParseTree(ctx.id());
        Object resultValue = result.getResult();

        if (resultValue instanceof BigDecimal) {
            BigDecimal bigDecimalValue = (BigDecimal) resultValue;
            bigDecimalValue = bigDecimalValue.add(BigDecimal.ONE);
            result.setResult(bigDecimalValue);

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
