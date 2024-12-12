package com.wl.util;

import com.wl.g4.ZLExpressLexer;

import java.util.HashMap;
import java.util.Map;

/**
 * 类型处理
 *
 * @author wanglei
 */
public class TypeUtil {

    private static Map<Class, Integer> typeMap = new HashMap<Class, Integer>(){{
        put(Integer.class, ZLExpressLexer.INT_TYPE);
        put(Double.class,ZLExpressLexer.DOUBLE_TYPE);
        put(Boolean.class,ZLExpressLexer.BOOL_TYPE);
        put(String.class,ZLExpressLexer.STRING_TYPE);
    }};

    public static Integer getTypeByJavaClass(Class clazz) {
        if (null == clazz) {
            return null;
        }
        return typeMap.get(clazz);
    }
}
