package com.wl.zl.impl;

import java.util.Objects;

public class Result {
    private Object result;
    private Class clazz;

    public Class getClazz() {
        return clazz;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public Result(Object result, Class clazz) {
        this.result = result;
        this.clazz = clazz;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Result result1 = (Result) o;
        return Objects.equals(result, result1.result) && Objects.equals(clazz, result1.clazz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, clazz);
    }

    @Override
    public String toString() {
        return null == result ? null : result.toString();
    }
}
