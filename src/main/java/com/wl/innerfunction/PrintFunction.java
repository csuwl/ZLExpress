package com.wl.innerfunction;

import com.wl.model.InnerFunctionDefinition;

import java.util.List;

/**
 * 打印
 *
 * @author wanglei
 */
public class PrintFunction implements IInnerFunctionInterface {
    @Override
    public Object visit(List<Object> parameterValue) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < parameterValue.size(); i++) {
            stringBuilder.append(parameterValue.get(i));
        }
        System.out.println(stringBuilder.toString());
        return null;
    }

    @Override
    public List<InnerFunctionDefinition> getInnerFunctionDefinition() {
        return List.of(new InnerFunctionDefinition("print"));
    }
}
