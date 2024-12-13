package com.wl.model;

import java.util.Objects;

public class Result {
    private Object result;
    private Class clazzType;

    public Class getClazzType() {
        return clazzType;
    }

    public void setClazzType(Class clazzType) {
        this.clazzType = clazzType;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public Result(Object result, Class clazzType) {
        this.result = result;
        this.clazzType = clazzType;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Result result1 = (Result) o;
        return Objects.equals(result, result1.result) && Objects.equals(clazzType, result1.clazzType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, clazzType);
    }

    @Override
    public String toString() {
        return null == result ? null : result.toString();
    }
}
