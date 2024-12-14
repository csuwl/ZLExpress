package com.csuwl.innerfunction;

import com.csuwl.model.InnerFunctionDefinition;

import java.util.List;

public interface ExtenderCustomFunctionInterface {
    Object visit(List<Object> parameterValue);

    List<InnerFunctionDefinition> getInnerFunctionDefinition();
}
