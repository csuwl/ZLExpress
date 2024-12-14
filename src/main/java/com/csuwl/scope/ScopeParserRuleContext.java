package com.csuwl.scope;

import com.csuwl.g4.ZLExpressParser;
import com.csuwl.model.FunctionDefinition;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * parameter scope
 * @author wanglei
 */
public class ScopeParserRuleContext extends ParserRuleContext implements IScopeValue {
    private Map<Object, Object> context = new ConcurrentHashMap<>();
    private Map<FunctionDefinition, List<ZLExpressParser.DefFunctionContext>> functionMap = new ConcurrentHashMap<>();
    private Map<String, String> class2PathMap = new ConcurrentHashMap<>();

    public ScopeParserRuleContext() {
    }

    public ScopeParserRuleContext(ParserRuleContext parent, int invokingStateNumber) {
        super(parent, invokingStateNumber);
    }

    public Map<Object, Object> getContext() {
        return context;
    }

    public Map<FunctionDefinition, List<ZLExpressParser.DefFunctionContext>> getFunctionMap() {
        return functionMap;
    }

    public Map<String, String> getClass2PathMap() {
        return class2PathMap;
    }

    public void clear(){
        context.clear();
        functionMap.clear();
        class2PathMap.clear();
    }

}
