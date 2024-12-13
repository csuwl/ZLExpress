package com.wl.innerfunction;

import com.wl.model.InnerFunctionDefinition;

import java.util.List;

public interface IInnerFunctionInterface {
    Object visit(List<Object> parameterValue);

    List<InnerFunctionDefinition> getInnerFunctionDefinition();
}
