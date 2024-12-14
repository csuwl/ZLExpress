package com.csuwl.util;

import com.csuwl.g4.ZLExpressLexer;
import com.csuwl.g4.ZLExpressParser;
import com.csuwl.model.AssignModel;
import com.csuwl.model.Result;
import com.csuwl.zl.VisitProcess;
import org.antlr.v4.runtime.Token;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author wanglei
 */
public class AssignUtil {

    /**
     * get id and value
     *
     * @param ctx
     * @param visitProcess
     * @param highPrecise
     * @return
     */
    public static AssignModel getAssignModel(ZLExpressParser.AssignExpressionContext ctx, VisitProcess visitProcess, Boolean highPrecise) {
        if (null != highPrecise && highPrecise) {
            int childCount = ctx.getChildCount();
            String symbel = null;
            Result result = null;
            Token typeToken = null;
            Object value = null;
            if (childCount == 3) {
                symbel = ctx.getStart().getText();
                result = visitProcess.visitParseTree(ctx.getChild(2));
            } else if (childCount == 4) {
                typeToken = ctx.getStart();
                symbel = ctx.getChild(1).getText();
                result = visitProcess.visitParseTree(ctx.getChild(3));
            }

            if (null != typeToken) {
                if (ZLExpressLexer.INT_TYPE == typeToken.getType()) {
                    value = new BigDecimal(result.getResult().toString());
                } else if (ZLExpressLexer.DOUBLE_TYPE == typeToken.getType()) {
                    value = new BigDecimal(result.getResult().toString());
                } else if (ZLExpressLexer.STRING_TYPE == typeToken.getType()) {
                    value = result.getResult().toString();
                } else if (ZLExpressLexer.BOOL_TYPE == typeToken.getType()) {
                    value = Boolean.parseBoolean(result.getResult().toString());
                }
            } else {
                value = result.getResult();
            }

            return new AssignModel(symbel, value);

        } else {

            int childCount = ctx.getChildCount();
            String symbel = null;
            Result result = null;
            Token typeToken = null;
            Object value = null;
            if (childCount == 3) {
                symbel = ctx.getStart().getText();
                result = visitProcess.visitParseTree(ctx.getChild(2));
            } else if (childCount == 4) {
                typeToken = ctx.getStart();
                symbel = ctx.getChild(1).getText();
                result = visitProcess.visitParseTree(ctx.getChild(3));
            }

            if (null != typeToken) {
                if (ZLExpressLexer.INT_TYPE == typeToken.getType()) {
                    value = Integer.parseInt(result.getResult().toString());
                } else if (ZLExpressLexer.DOUBLE_TYPE == typeToken.getType()) {
                    value = Double.parseDouble(result.getResult().toString());
                } else if (ZLExpressLexer.STRING_TYPE == typeToken.getType()) {
                    value = result.getResult().toString();
                } else if (ZLExpressLexer.BOOL_TYPE == typeToken.getType()) {
                    value = Boolean.parseBoolean(result.getResult().toString());
                }
            } else {
                value = result.getResult();
            }

            return new AssignModel(symbel, value);
        }
    }
}
