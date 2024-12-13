package com.wl.model;

import java.util.Objects;

/**
 * @author wanglei
 */
public class Result {
    private Object result;
    private Class clazzType;
    private int message;

    public Class getClazzType() {
        return clazzType;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public int getMessage() {
        return message;
    }

    public void setMessage(int message) {
        this.message = message;
    }

    public Result(Object result) {
        this.result = result;
        if (null != result) {
            this.clazzType = result.getClass();
        }
    }

    /**
     * set message
     * @param result
     * @param message
     */
    public Result(Object result, int message) {
        this(result);
        this.message = message;
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
