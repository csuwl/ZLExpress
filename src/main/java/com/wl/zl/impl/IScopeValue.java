package com.wl.zl.impl;

import com.wl.g4.ZLExpressParser;
import com.wl.model.FunctionDefinition;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public interface IScopeValue {
    Map<Object, Object> context = new ConcurrentHashMap<>();
    Map<FunctionDefinition, List<ZLExpressParser.DefFunctionContext>> functionMap = new ConcurrentHashMap<>();
    Map<String,String> class2PathMap = new ConcurrentHashMap<>();

    default Map<Object, Object> getContext() {
        return context;
    }

    default Map<FunctionDefinition, List<ZLExpressParser.DefFunctionContext>> getFunctionMap() {
        return functionMap;
    }

    default Map<String, String> getClass2PathMap() {
        return class2PathMap;
    }
}
