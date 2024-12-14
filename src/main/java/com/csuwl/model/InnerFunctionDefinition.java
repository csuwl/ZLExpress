package com.csuwl.model;

import java.util.Objects;

public class InnerFunctionDefinition {
    private String functionName;

    public InnerFunctionDefinition() {
    }

    public InnerFunctionDefinition(String functionName) {
        this.functionName = functionName;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        InnerFunctionDefinition that = (InnerFunctionDefinition) o;
        return Objects.equals(functionName, that.functionName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(functionName);
    }
}
