package com.wl.zl.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public interface IScopeValue {
    Map<String,Object> map= new HashMap<>();
    default Map<String, Object> getMap(){
        return map;
    }
}
