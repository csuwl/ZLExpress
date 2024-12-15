package com.csuwl.util;

import com.csuwl.constant.Constant;
import com.csuwl.g4.ZLExpressLexer;
import com.csuwl.g4.ZLExpressParser;
import com.csuwl.model.AssignModel;
import com.csuwl.model.Result;
import com.csuwl.zl.ICustomVisitor;
import com.csuwl.zl.VisitProcess;
import com.csuwl.zl.impl.highprecise.AssignVis;
import org.antlr.v4.runtime.Token;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * @author wanglei
 */
public class AssignUtil {

    /**
     * get id and value
     *
     * @param iCustomVisitor
     * @param ctx
     * @param visitProcess
     * @param highPrecise
     * @return
     */
    public static AssignModel getAssignModel(ICustomVisitor iCustomVisitor, ZLExpressParser.AssignExpressionContext ctx, VisitProcess visitProcess, Boolean highPrecise) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
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
                switch (typeToken.getType()) {
                    case ZLExpressLexer.INT_TYPE:
                        value = new BigDecimal(result.getResult().toString());
                        break;
                    case ZLExpressLexer.DOUBLE_TYPE:
                        value = new BigDecimal(result.getResult().toString());
                        break;
                    case ZLExpressLexer.STRING_TYPE:
                        value = result.getResult().toString();
                        break;
                    case ZLExpressLexer.BOOL_TYPE:
                        value = Boolean.parseBoolean(result.getResult().toString());
                        break;
                    case ZLExpressLexer.ARRAY_TYPE:
                        Object resultArray = result.getResult();
                        if (resultArray instanceof List) {
                            value = (List) resultArray;
                        } else {
                            value = Arrays.asList(resultArray);
                        }
                        break;
                    case ZLExpressLexer.IDENTIFIER:
//                        custom object type
                        String custObjectClassName = typeToken.getText();
                        String path = iCustomVisitor.resolveClass2Path(ctx, custObjectClassName);
                        if (null == path) {
                            path = Constant.DEFAULT_PACKAGE_PATH + custObjectClassName;
                        }
                        Class<?> clazz = Class.forName(path);
                        Object resultObject = result.getResult();
                        if (resultObject.getClass().isAssignableFrom(clazz)) {
                            value = resultObject;
                        } else {
                            throw new RuntimeException("can not cast result Object to " + clazz.getName());
                        }
                        break;
                    default:
                        throw new RuntimeException("do not support type to assign" + typeToken.getType());
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
                switch (typeToken.getType()) {
                    case ZLExpressLexer.INT_TYPE:
                        value = Integer.parseInt(result.getResult().toString());
                        break;
                    case ZLExpressLexer.DOUBLE_TYPE:
                        value = Double.parseDouble(result.getResult().toString());
                        break;
                    case ZLExpressLexer.STRING_TYPE:
                        value = result.getResult().toString();
                        break;
                    case ZLExpressLexer.BOOL_TYPE:
                        value = Boolean.parseBoolean(result.getResult().toString());
                        break;
                    case ZLExpressLexer.ARRAY_TYPE:
                        Object resultArray = result.getResult();
                        if (resultArray instanceof List) {
                            value = (List) resultArray;
                        } else {
                            value = Arrays.asList(resultArray);
                        }
                        break;
                    case ZLExpressLexer.IDENTIFIER:
//                        custom object type
                        String custObjectClassName = typeToken.getText();
                        String path = iCustomVisitor.resolveClass2Path(ctx, custObjectClassName);
                        if (null == path) {
                            path = Constant.DEFAULT_PACKAGE_PATH + custObjectClassName;
                        }
                        Class<?> clazz = Class.forName(path);
                        Object resultObject = result.getResult();
                        if (resultObject.getClass().isAssignableFrom(clazz)) {
                            value = resultObject;
                        } else {
                            throw new RuntimeException("can not cast result Object to " + clazz.getName());
                        }
                        break;
                    default:
                        throw new RuntimeException("do not support type to assign" + typeToken.getType());
                }
            } else {
                value = result.getResult();
            }

            return new AssignModel(symbel, value);
        }
    }
}
