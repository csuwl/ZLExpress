package com.wl.zl.impl;

import java.util.HashMap;
import java.util.Map;

public interface IScopeValue {
    Map<Object,Object> context= new HashMap<>();
    default Map<Object, Object> getContext(){
        return context;
    }
}
