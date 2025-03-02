package com.csuwl.util;

import java.math.BigDecimal;

public class NumUtil {

    public static <T extends Number, R extends Number> int compareDoubleInteger(T num1, R num2) {
        double v = num1.doubleValue() - num2.doubleValue();
        if (v == 0) {
            return 0;
        }
        return v > 0 ? 1 : -1;
    }

    public static <T extends Number, R extends Number> int compareBigDecimal(T num1, R num2) {
        BigDecimal bigDecimal1 = new BigDecimal(num1.toString());
        BigDecimal bigDecimal2 = new BigDecimal(num2.toString());
        return bigDecimal1.compareTo(bigDecimal2);
    }

    public static <T extends Number> BigDecimal toBigDecimal(T num) {
        return new BigDecimal(num.toString());
    }

}
