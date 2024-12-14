package com.csuwl;

import com.csuwl.innerfunction.ExtenderCustomFunctionInterface;
import com.csuwl.model.InnerFunctionDefinition;

import java.util.Arrays;
import java.util.List;

/**
 * custom function
 * prettyPrint
 */
public class CustomPrintFunction implements ExtenderCustomFunctionInterface {
    @Override
    public Object visit(List<Object> parameterValue) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < parameterValue.size(); i++) {
            stringBuilder.append(parameterValue.get(i));
        }
        stringBuilder.append("]");

        System.out.println(stringBuilder.toString());
        return null;
    }

    @Override
    public List<InnerFunctionDefinition> getInnerFunctionDefinition() {
        return Arrays.asList(new InnerFunctionDefinition("prettyPrint"),new InnerFunctionDefinition("myPrint"));
    }
}
