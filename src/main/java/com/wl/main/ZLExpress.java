package com.wl.main;

import com.wl.g4.ZLExpressLexer;
import com.wl.g4.ZLExpressParser;
import com.wl.model.Result;
import com.wl.zl.impl.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

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
        LocalFuncExeVis localFuncExeVis = new LocalFuncExeVis();
        CompareVis compareVis = new CompareVis();
        NullVis nullVis = new NullVis();
        NotVis notVis = new NotVis();
        ArrayVis arrayVis = new ArrayVis();
        InVis inVis = new InVis();
        NotInVis notInVis = new NotInVis();
        AndVis andVis = new AndVis();
        OrVis orVis = new OrVis();
        ReturnVis returnVis = new ReturnVis();
        ImportVis importVis = new ImportVis();
        NewObjectVis newObjectVis = new NewObjectVis();
        ObjectExeFunctionVis objectExeFunctionVis = new ObjectExeFunctionVis();

        Map<Class<? extends ParseTree>, ICustomVisitor> visitorMap = new HashMap<Class<? extends ParseTree>, ICustomVisitor>() {
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
                put(localFuncExeVis.getProcessType(), localFuncExeVis);
                put(compareVis.getProcessType(), compareVis);
                put(nullVis.getProcessType(), nullVis);
                put(notVis.getProcessType(), notVis);
                put(arrayVis.getProcessType(), arrayVis);
                put(inVis.getProcessType(), inVis);
                put(notInVis.getProcessType(), notInVis);
                put(andVis.getProcessType(), andVis);
                put(orVis.getProcessType(), orVis);
                put(returnVis.getProcessType(), returnVis);
                put(importVis.getProcessType(), importVis);
                put(newObjectVis.getProcessType(), newObjectVis);
                put(objectExeFunctionVis.getProcessType(), objectExeFunctionVis);
            }
        };

        visitProcess.setVisitorMap(visitorMap);
    }


    private Map<String, ZLExpressParser.ExprListContext> cacheExpress = new ConcurrentHashMap<>();

    /**
     * script enter method
     *
     * @param express
     * @param context
     * @param cache
     * @return
     */
    public Object process(String express, Map<Object, Object> context, Boolean cache) {
        Result result = processResult(express, context, cache);
        return result.getResult();
    }

    /**
     * script enter method
     *
     * @param express
     * @param context
     * @param cache
     * @return
     */
    public Result processResult(String express, Map<Object, Object> context, Boolean cache) {

        if (null == cache) {
            cache = Boolean.FALSE;
        }
        ZLExpressParser.ExprListContext exprListContext = null;
        if (cache && cacheExpress.containsKey(express)) {
//            check has same express
            exprListContext = cacheExpress.get(express);
        } else {
            ZLExpressLexer lexer = new ZLExpressLexer(CharStreams.fromString(express));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ZLExpressParser zlExpressParser = new ZLExpressParser(tokens);
            exprListContext = zlExpressParser.exprList();
        }

        if (null != context && context.size() > 0) {
            Map<Object, Object> contextMap = exprListContext.getContext();
            contextMap.putAll(context);
        }
        return visitProcess.visitParseTree(exprListContext);
    }
}
