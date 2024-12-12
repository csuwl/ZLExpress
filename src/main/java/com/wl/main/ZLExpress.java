package com.wl.main;

import com.wl.g4.ZLExpressLexer;
import com.wl.g4.ZLExpressParser;
import com.wl.zl.impl.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Arrays;
import java.util.HashMap;
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
        DefFuncVis defFuncVis = new DefFuncVis();
        FuncExeVis funcExeVis = new FuncExeVis();

        Map<Class<? extends ParseTree>, ICustomVisitor> visitorMap = new HashMap<Class<? extends ParseTree>, ICustomVisitor>(){
            {
                put(plusVis.getProcessType(), plusVis);
                put(assignVis.getProcessType(), assignVis);
                put(expressionVis.getProcessType(), expressionVis);
                put(doubleConstantVis.getProcessType(), doubleConstantVis);
                put(integerConstantVis.getProcessType(), integerConstantVis);
                put(numConstantVis.getProcessType(), numConstantVis);
                put(exprListVis.getProcessType(), exprListVis);
                put(idVis.getProcessType(), idVis);
                put(textConstantVis.getProcessType(), textConstantVis);
                put(groupComputeVis.getProcessType(), groupComputeVis);
                put(groupVis.getProcessType(), groupVis);
                put(defFuncVis.getProcessType(), defFuncVis);
                put(funcExeVis.getProcessType(), funcExeVis);
            }
        };

        visitProcess.setVisitorMap(visitorMap);
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
