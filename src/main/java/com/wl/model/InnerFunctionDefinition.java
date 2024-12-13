package com.wl.model;

import java.util.List;
import java.util.Objects;

public class InnerFunctionDefinition {
    private String functionName;
    private List<Class> parameterClazzTypes;

    public InnerFunctionDefinition(String functionName, List<Class> parameterClazzTypes) {
        this.functionName = functionName;
        this.parameterClazzTypes = parameterClazzTypes;
    }

    public InnerFunctionDefinition() {
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public List<Class> getParameterClazzTypes() {
        return parameterClazzTypes;
    }

    public void setParameterClazzTypes(List<Class> parameterClazzTypes) {
        this.parameterClazzTypes = parameterClazzTypes;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        InnerFunctionDefinition that = (InnerFunctionDefinition) o;
        return Objects.equals(functionName, that.functionName) && Objects.equals(parameterClazzTypes, that.parameterClazzTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(functionName, parameterClazzTypes);
    }
}
