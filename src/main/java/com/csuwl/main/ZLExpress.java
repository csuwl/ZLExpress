package com.csuwl.main;

import com.csuwl.g4.ZLExpressLexer;
import com.csuwl.g4.ZLExpressParser;
import com.csuwl.model.Result;
import com.csuwl.zl.VisitProcess;
import com.csuwl.zl.impl.*;
import com.csuwl.zl.ICustomVisitor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.HashMap;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ZLExpress enter class
 *
 * @author wanglei
 */
public class ZLExpress {
    private static VisitProcess visitProcess = new VisitProcess();

    static {
        Map<Class<? extends ParseTree>, ICustomVisitor> visitorMap = new HashMap<Class<? extends ParseTree>, ICustomVisitor>();
        ServiceLoader<ICustomVisitor> visitors = ServiceLoader.load(ICustomVisitor.class);
        for (ICustomVisitor visitor : visitors) {
            visitorMap.put(visitor.getProcessType(), visitor);
        }
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
