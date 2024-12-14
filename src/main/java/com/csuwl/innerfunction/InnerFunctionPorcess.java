package com.csuwl.innerfunction;

import com.csuwl.model.InnerFunctionDefinition;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 内置函数
 *
 * @author wanglei
 */
public class InnerFunctionPorcess {
    private static Map<InnerFunctionDefinition, IInnerFunctionInterface> innerMethodsMap = new ConcurrentHashMap<>();
    private static Map<InnerFunctionDefinition, ExtenderCustomFunctionInterface> customeMethodsMap = new ConcurrentHashMap<>();

    static {

        ServiceLoader<IInnerFunctionInterface> iInnerFunctionInterfaceList = ServiceLoader.load(IInnerFunctionInterface.class);
        for (IInnerFunctionInterface iInnerFunctionInterface : iInnerFunctionInterfaceList) {
            List<InnerFunctionDefinition> innerFunctionDefinition = iInnerFunctionInterface.getInnerFunctionDefinition();
            for (InnerFunctionDefinition innerFunctionDefinitionItem : innerFunctionDefinition) {
                innerMethodsMap.put(innerFunctionDefinitionItem, iInnerFunctionInterface);
            }
        }
//        extend function
        ServiceLoader<ExtenderCustomFunctionInterface> extenderCustomFunctionInterfaceList = ServiceLoader.load(ExtenderCustomFunctionInterface.class);
        for (ExtenderCustomFunctionInterface extenderCustomFunctionInterface : extenderCustomFunctionInterfaceList) {
            List<InnerFunctionDefinition> innerFunctionDefinition = extenderCustomFunctionInterface.getInnerFunctionDefinition();
            for (InnerFunctionDefinition innerFunctionDefinitionItem : innerFunctionDefinition) {
                customeMethodsMap.put(innerFunctionDefinitionItem, extenderCustomFunctionInterface);
            }
        }

    }

    /**
     * @param functionDefinition
     * @param parameterValue
     * @return
     */
    public static Object visit(InnerFunctionDefinition functionDefinition, List<Object> parameterValue) {
        if (customeMethodsMap.containsKey(functionDefinition)) {
            return customeMethodsMap.get(functionDefinition).visit(parameterValue);
        } else if (innerMethodsMap.containsKey(functionDefinition)) {
            return innerMethodsMap.get(functionDefinition).visit(parameterValue);
        }
        throw new RuntimeException("没有找到函数定义");
    }
}
