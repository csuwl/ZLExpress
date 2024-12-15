package com.csuwl.zl.impl;

import com.csuwl.constant.Constant;
import com.csuwl.g4.ZLExpressParser;
import com.csuwl.model.Result;
import com.csuwl.zl.ICustomVisitor;
import com.csuwl.zl.VisitProcess;
import org.antlr.v4.runtime.tree.ParseTree;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * new object
 *
 * @author wanglei
 */
public class NewObjectVis implements ICustomVisitor {
    @Override
    public Result visit(ParseTree tree, VisitProcess visitProcess) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
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

        if (null == path) {
            path = Constant.DEFAULT_PACKAGE_PATH + className;
        }
        Class<?> clazz = Class.forName(path);
        Constructor<?> constructor = clazz.getConstructor(classTypes);
        return new Result(constructor.newInstance(parameterValueArray));


    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.NewObjectExpressionContext.class;
    }
}
