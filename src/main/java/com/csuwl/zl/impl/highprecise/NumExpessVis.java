package com.csuwl.zl.impl.highprecise;

import com.csuwl.g4.ZLExpressParser;
import com.csuwl.model.Result;
import com.csuwl.util.NumUtil;
import com.csuwl.zl.ICustomVisitor;
import com.csuwl.zl.IHighPreciseCustomVisitor;
import com.csuwl.zl.VisitProcess;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

/**
 * @author wanglei
 */
public class NumExpessVis implements IHighPreciseCustomVisitor {
    @Override
    public Result visit(ParseTree tree, VisitProcess visitProcess) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        ZLExpressParser.NumExpressionContext ctx = (ZLExpressParser.NumExpressionContext) tree;
        TerminalNode minus = ctx.MINUS();

        Result result = visitProcess.visitParseTree(ctx.getChild(1));
        Object resultValue = result.getResult();
        if (!(resultValue instanceof Number)) {
            throw new RuntimeException("不是数字");
        }

        if (resultValue instanceof BigDecimal) {
            BigDecimal res = (BigDecimal) resultValue;
            if (null != minus) {
                return new Result(res.negate());
            }
            return new Result(res);
        } else {
            BigDecimal res = NumUtil.toBigDecimal((Number) resultValue);
            if (null != minus) {
                return new Result(res.negate());
            }
            return new Result(res);
        }

    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.NumExpressionContext.class;
    }
}
