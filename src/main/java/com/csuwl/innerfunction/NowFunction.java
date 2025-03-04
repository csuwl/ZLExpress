package com.csuwl.innerfunction;

import com.csuwl.model.InnerFunctionDefinition;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

/**
 * 创建日期
 * 获取当前日期
 */
public class NowFunction implements IInnerFunctionInterface {
    @Override
    public Object visit(List<Object> parameterValue) {
        if (null == parameterValue || parameterValue.isEmpty()) {
            return LocalDate.now();
        }
        String day = (String) parameterValue.get(0);
        LocalDate localDate = LocalDate.parse(day, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        return localDate;
    }

    @Override
    public List<InnerFunctionDefinition> getInnerFunctionDefinition() {
        return Arrays.asList(new InnerFunctionDefinition("now"), new InnerFunctionDefinition("date"));
    }
}
