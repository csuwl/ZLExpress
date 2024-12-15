package com.csuwl.zl.impl;

import com.csuwl.g4.ZLExpressParser;
import com.csuwl.model.Result;
import com.csuwl.util.NumUtil;
import com.csuwl.zl.ICustomVisitor;
import com.csuwl.zl.VisitProcess;
import org.antlr.v4.runtime.tree.ParseTree;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

/**
 * ++ process
 *
 * @author wanglei
 */
public class PlusPlusVis implements ICustomVisitor {
    @Override
    public Result visit(ParseTree tree, VisitProcess visitProcess) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        ZLExpressParser.PlusPlusExpressionContext ctx = (ZLExpressParser.PlusPlusExpressionContext) tree;
        Result result = visitProcess.visitParseTree(ctx.id());

        Object resultValue = result.getResult();
        if (!(resultValue instanceof Number)) {
            throw new RuntimeException("不是数字无法相加");
        }

        if (resultValue instanceof Integer) {
            result.setResult((Integer) result.getResult() + 1);
            putParentContext(tree, ctx.id().getText(), result.getResult());
            return result;
        } else if (resultValue instanceof Double) {
            result.setResult((Double) result.getResult() + 1);
            putParentContext(tree, ctx.id().getText(), result.getResult());
            return result;
        } else {
            BigDecimal res = NumUtil.toBigDecimal((Number) resultValue);
            res = res.add(BigDecimal.ONE);
            result.setResult(res);
            putParentContext(tree, ctx.id().getText(), res);
            return result;
        }
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.PlusPlusExpressionContext.class;
    }
}
