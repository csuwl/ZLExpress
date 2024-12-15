package com.csuwl.zl.impl;

import com.csuwl.g4.ZLExpressParser;
import com.csuwl.model.Result;
import com.csuwl.util.NumUtil;
import com.csuwl.zl.ICustomVisitor;
import com.csuwl.zl.VisitProcess;
import org.antlr.v4.runtime.tree.ParseTree;

import java.lang.reflect.InvocationTargetException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalField;
import java.util.Date;

/**
 * 'A agoDay B' means 'now() - A > B';
 * <p>
 * 3 days ago example:
 * dds = now();
 * dds agoDay 3;
 * "2024-12-12" agoDay 3;
 *
 * @author wanglei
 */
public class AgoDayVis implements ICustomVisitor {
    @Override
    public Result visit(ParseTree tree, VisitProcess visitProcess) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        ZLExpressParser.AgoDayExpressionContext ctx = (ZLExpressParser.AgoDayExpressionContext) tree;
        Result result1 = visitProcess.visitParseTree(ctx.getChild(0));
        Result result2 = visitProcess.visitParseTree(ctx.getChild(2));
        Object result1Value = result1.getResult();
        Object result2Value = result2.getResult();

        if (result1Value instanceof LocalDate) {
            LocalDate res1 = (LocalDate) result1Value;
            LocalDate today = LocalDate.now();
            long diffDay = today.getLong(ChronoField.EPOCH_DAY) - res1.getLong(ChronoField.EPOCH_DAY);
            if (result2Value instanceof Number) {
                return new Result(NumUtil.compareDoubleInteger(diffDay, (Number) result2Value) > 0);
            } else {
                throw new RuntimeException("result2 must be number");
            }
        } else if (result1Value instanceof LocalDateTime) {
            LocalDateTime res1 = (LocalDateTime) result1Value;
            LocalDate today = LocalDate.now();
            long diffDay = today.getLong(ChronoField.EPOCH_DAY) - res1.getLong(ChronoField.EPOCH_DAY);
            if (result2Value instanceof Number) {
                return new Result(NumUtil.compareDoubleInteger(diffDay, (Number) result2Value) > 0);
            } else {
                throw new RuntimeException("result2 must be number");
            }
        } else if (result1Value instanceof Date) {
            Date res1 = (Date) result1Value;
            LocalDate res1LocalDate = res1.toInstant()
                    .atZone(ZoneId.systemDefault())
                    .toLocalDate();

            LocalDate today = LocalDate.now();

            long diffDay = today.getLong(ChronoField.EPOCH_DAY) - res1LocalDate.getLong(ChronoField.EPOCH_DAY);
            if (result2Value instanceof Number) {
                return new Result(NumUtil.compareDoubleInteger(diffDay, (Number) result2Value) > 0);
            } else {
                throw new RuntimeException("result2 must be number");
            }
        } else if (result1Value instanceof String) {
            String res1 = (String) result1Value;
            res1 = res1.substring(0, 10);
            String[] splitDate = res1.split("-");
            LocalDate res1LocalDate = LocalDate.of(Integer.parseInt(splitDate[0]), Integer.parseInt(splitDate[1]), Integer.parseInt(splitDate[2]));
            LocalDate today = LocalDate.now();

            long diffDay = today.getLong(ChronoField.EPOCH_DAY) - res1LocalDate.getLong(ChronoField.EPOCH_DAY);
            if (result2Value instanceof Number) {
                return new Result(NumUtil.compareDoubleInteger(diffDay, (Number) result2Value) > 0);
            } else {
                throw new RuntimeException("result2 must be number");
            }
        }

       return new Result(false);
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.AgoDayExpressionContext.class;
    }
}
