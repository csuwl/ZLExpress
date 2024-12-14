package com.csuwl.scope;

import com.csuwl.g4.ZLExpressParser;
import com.csuwl.model.FunctionDefinition;

import java.util.List;
import java.util.Map;

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
