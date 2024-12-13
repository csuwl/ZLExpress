package com.wl.innerfunction;

import com.wl.model.InnerFunctionDefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 内置函数
 *
 * @author wanglei
 */
public class InnerFunction {
    private static Map<InnerFunctionDefinition, IInnerFunctionInterface> innerMethodsMap = new ConcurrentHashMap<>();

    static {
        NowFunction nowFunction = new NowFunction();
        List<InnerFunctionDefinition> innerFunctionDefinition = nowFunction.getInnerFunctionDefinition();
        for (int i = 0; i < innerFunctionDefinition.size(); i++) {
            innerMethodsMap.put(innerFunctionDefinition.get(i), nowFunction);
        }

        PrintFunction printFunction = new PrintFunction();
        innerFunctionDefinition = printFunction.getInnerFunctionDefinition();
        for (int i = 0; i < innerFunctionDefinition.size(); i++) {
            innerMethodsMap.put(innerFunctionDefinition.get(i), printFunction);
        }

    }

    /**
     * @param functionDefinition
     * @param parameterValue
     * @return
     */
    public static Object visit(InnerFunctionDefinition functionDefinition, List<Object> parameterValue) {
        if (!innerMethodsMap.containsKey(functionDefinition)) {
            throw new RuntimeException("没有找到函数定义");
        }
        IInnerFunctionInterface iInnerFunctionInterface = innerMethodsMap.get(functionDefinition);
        return iInnerFunctionInterface.visit(parameterValue);
    }
}
