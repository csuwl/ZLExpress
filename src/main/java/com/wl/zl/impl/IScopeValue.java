package com.wl.zl.impl;

import com.wl.g4.ZLExpressParser;
import com.wl.model.FunctionDefinition;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface IScopeValue {
    Map<Object, Object> context = new HashMap<>();
    Map<FunctionDefinition, List<ZLExpressParser.DefFunctionContext>> functionMap = new HashMap<>();

    default Map<Object, Object> getContext() {
        return context;
    }

    default Map<FunctionDefinition, List<ZLExpressParser.DefFunctionContext>> getFunctionMap() {
        return functionMap;
    }
}
