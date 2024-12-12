package com.wl.model;

import java.util.List;
import java.util.Objects;

/**
 * 函数定义，用来查找函数
 * @author wanglei
 */
public class FunctionDefinition {
    private String functionName;
    private List<Integer> parameterTypes;


    public FunctionDefinition() {
    }

    public FunctionDefinition(String functionName, List<Integer> parameterTypes) {
        this.functionName = functionName;
        this.parameterTypes = parameterTypes;
    }


    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public List<Integer> getParameterTypes() {
        return parameterTypes;
    }

    public void setParameterTypes(List<Integer> parameterTypes) {
        this.parameterTypes = parameterTypes;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        FunctionDefinition that = (FunctionDefinition) o;
        return Objects.equals(functionName, that.functionName)  && Objects.equals(parameterTypes, that.parameterTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(functionName, parameterTypes);
    }
}
