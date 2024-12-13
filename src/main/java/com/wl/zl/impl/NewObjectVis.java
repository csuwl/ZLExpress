package com.wl.zl.impl;

import com.wl.g4.ZLExpressParser;
import com.wl.model.Result;
import org.antlr.v4.runtime.tree.ParseTree;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * new object
 * @author wanglei
 */
public class NewObjectVis implements ICustomVisitor<Object> {
    @Override
    public Object visit(ParseTree tree, VisitProcess visitProcess) {
        ZLExpressParser.NewObjectExpressionContext ctx = (ZLExpressParser.NewObjectExpressionContext) tree;
        String className = ctx.packagePath().getText();
        String path = resolveClass2Path(tree, className);
        ZLExpressParser.FunctionExecuteParameterListContext functionExecuteParameterListContext = ctx.functionExecuteParameterList();
        List<ZLExpressParser.FunctionExecuteParameterContext> parameters = functionExecuteParameterListContext.functionExecuteParameter();

//        创建对象参数
        Object[] parameterValueArray = new Object[parameters.size()];
        Class[] classTypes = new Class[parameters.size()];
        for (int i = 0; i < parameters.size(); i++) {
            Result result = visitProcess.visitParseTree(parameters.get(i));
            parameterValueArray[i] = result.getResult();
            classTypes[i] = result.getClazzType();
        }

        try {
            Class<?> clazz = Class.forName(path);
            Constructor<?> constructor = clazz.getConstructor(classTypes);
            return constructor.newInstance(parameterValueArray);

        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.NewObjectExpressionContext.class;
    }
}
