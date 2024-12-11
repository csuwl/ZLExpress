package com.wl.main;

import com.wl.g4.ZLExpressLexer;
import com.wl.g4.ZLExpressParser;
import com.wl.zl.impl.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.Arrays;
import java.util.Map;

/**
 * ZLExpress enter class
 *
 * @author wanglei
 */
public class ZLExpress {
    private static VisitProcess visitProcess = new VisitProcess();

    static {
        PlusVis plusVis = new PlusVis();
        AssignVis assignVis = new AssignVis();
        ExpressionVis expressionVis = new ExpressionVis();
        DoubleConstantVis doubleConstantVis = new DoubleConstantVis();
        IntegerConstantVis integerConstantVis = new IntegerConstantVis();
        NumConstantVis numConstantVis = new NumConstantVis();
        ExprListVis exprListVis = new ExprListVis();
        IdVis idVis = new IdVis();
        TextConstantVis textConstantVis = new TextConstantVis();
        GroupComputeVis groupComputeVis = new GroupComputeVis();
        GroupVis groupVis = new GroupVis();
        visitProcess.setVisitorList(Arrays.asList(groupVis, groupComputeVis, textConstantVis, idVis, exprListVis, plusVis, assignVis, expressionVis, doubleConstantVis, integerConstantVis, numConstantVis));
    }

    public Object process(String express, Map<Object, Object> context, Boolean cache) {
        Result result = processResult(express, context, cache);
        return result.getResult();
    }

    public Result processResult(String express, Map<Object, Object> context, Boolean cache) {
        if (null == cache) {
            cache = Boolean.FALSE;
        }

        ZLExpressLexer lexer = new ZLExpressLexer(CharStreams.fromString(express));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ZLExpressParser zlExpressParser = new ZLExpressParser(tokens);

        return visitProcess.visitParseTree(zlExpressParser.exprList());
    }
}
