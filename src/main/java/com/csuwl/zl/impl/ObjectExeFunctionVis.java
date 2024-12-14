package com.csuwl.zl.impl;

import com.csuwl.g4.ZLExpressParser;
import com.csuwl.model.Result;
import com.csuwl.zl.ICustomVisitor;
import com.csuwl.zl.VisitProcess;
import org.antlr.v4.runtime.tree.ParseTree;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/**
 * call object method
 * @author wanglei
 */
public class ObjectExeFunctionVis implements ICustomVisitor {
    @Override
    public Result visit(ParseTree tree, VisitProcess visitProcess) {
        ZLExpressParser.ObjectFunctionExecuteContext ctx = (ZLExpressParser.ObjectFunctionExecuteContext) tree;
        ZLExpressParser.PackagePathContext packagePathContext = ctx.packagePath();
        String path = packagePathContext.getText();
        int indexOfPath = path.lastIndexOf(".");
        String ObjectName = path.substring(0, indexOfPath);
        String functionName = path.substring(indexOfPath + 1);
        Object object = resolveContext(tree, ObjectName);


        List<ZLExpressParser.FunctionExecuteParameterListContext> functionExecuteParameterListContexts = ctx.getRuleContexts(ZLExpressParser.FunctionExecuteParameterListContext.class);
        ZLExpressParser.FunctionExecuteParameterListContext functionExecuteParameterListContext = functionExecuteParameterListContexts.get(0);
        List<ZLExpressParser.FunctionExecuteParameterContext> executeParameterItemList = functionExecuteParameterListContext.getRuleContexts(ZLExpressParser.FunctionExecuteParameterContext.class);

//      获取函数参数类型
        Class[] parameterTypes = new Class[executeParameterItemList.size()];
        Object[] parameterValues = new Object[executeParameterItemList.size()];
        for (int i = 0; i < executeParameterItemList.size(); i++) {
            Result result = visitProcess.visitParseTree(executeParameterItemList.get(i));
            parameterTypes[i] = result.getClazzType();
            parameterValues[i] = result.getResult();
        }

        Class<?> aClass = object.getClass();
        try {
            Method method = aClass.getMethod(functionName, parameterTypes);
            return new Result(method.invoke(object, parameterValues));
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.ObjectFunctionExecuteContext.class;
    }
}
