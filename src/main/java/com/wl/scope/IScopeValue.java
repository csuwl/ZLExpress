package com.wl.scope;

import com.wl.g4.ZLExpressParser;
import com.wl.model.FunctionDefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * parameter scope interface
 * @author wanglei
 */
public interface IScopeValue {

    Map<Object, Object> getContext();

    Map<FunctionDefinition, List<ZLExpressParser.DefFunctionContext>> getFunctionMap() ;

    Map<String, String> getClass2PathMap() ;
    void clear();
}
