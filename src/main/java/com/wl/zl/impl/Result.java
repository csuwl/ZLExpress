package com.wl.zl.impl;

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
    public String toString() {
        return null == result ? null : result.toString();
    }
}
