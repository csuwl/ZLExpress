package com.csuwl.zl;

import com.csuwl.g4.ZLExpressParser;
import com.csuwl.model.FunctionDefinition;
import com.csuwl.model.Result;
import com.csuwl.scope.IScopeValue;
import org.antlr.v4.runtime.tree.ParseTree;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

/**
 * visitor custom
 *
 * @author wanglei
 */
public interface ICustomVisitor {

    Result visit(ParseTree tree, VisitProcess visitProcess) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException;

    public Class<? extends ParseTree> getProcessType();


    default Object resolveContext(ParseTree tree, Object key) {

        ParseTree currentTree = tree;
        while (currentTree != null) {
            if (currentTree instanceof IScopeValue) {
                IScopeValue scopeValue = (IScopeValue) currentTree;
                Map<Object, Object> context = scopeValue.getContext();
                if (null != context && context.containsKey(key)) {
                    return context.get(key);
                }
            }
            currentTree = currentTree.getParent();
        }
        return null;
    }

    ;

    /**
     * 放到父级context
     *
     * @param tree
     * @param key
     * @param value
     */
    default void putParentContext(ParseTree tree, Object key, Object value) {

        while (tree != null) {
            ParseTree parent = tree.getParent();
            if (null == parent) {
                return;
            }
            if (parent instanceof IScopeValue) {
                IScopeValue scopeValue = (IScopeValue) parent;
                Map<Object, Object> context = scopeValue.getContext();
                context.put(key, value);
                return;
            }
            tree = parent;
        }
    }

    ;


    /**
     * 查找函数定义
     *
     * @param tree
     * @param functionDefinition
     * @return
     */
    default List<ZLExpressParser.DefFunctionContext> resolveParentFunctionDefinition(ParseTree tree, FunctionDefinition functionDefinition) {

        ParseTree currentTree = tree;
        while (currentTree != null) {
            if (currentTree instanceof IScopeValue) {
                IScopeValue scopeValue = (IScopeValue) currentTree;
                Map<FunctionDefinition, List<ZLExpressParser.DefFunctionContext>> functionMap = scopeValue.getFunctionMap();
                if (null != functionMap && functionMap.containsKey(functionDefinition)) {
                    return functionMap.get(functionDefinition);
                }
            }
            currentTree = currentTree.getParent();
        }
        return null;
    }

    /**
     * 放置函数定义
     *
     * @param tree
     * @param functionDefinition
     * @param defFunctionList
     */
    default void putParentFunctionDefinition(ParseTree tree, FunctionDefinition functionDefinition, List<ZLExpressParser.DefFunctionContext> defFunctionList) {
        while (tree != null) {
            ParseTree parent = tree.getParent();
            if (null == parent) {
                return;
            }
            if (parent instanceof IScopeValue) {
                IScopeValue scopeValue = (IScopeValue) parent;
                Map<FunctionDefinition, List<ZLExpressParser.DefFunctionContext>> functionMap = scopeValue.getFunctionMap();
                functionMap.put(functionDefinition, defFunctionList);
                return;
            }
            tree = parent;
        }
    }


    /**
     * 查找函数定义
     *
     * @param tree
     * @return
     */
    default String resolveClass2Path(ParseTree tree, String className) {

        ParseTree currentTree = tree;
        while (currentTree != null) {
            if (currentTree instanceof IScopeValue) {
                IScopeValue scopeValue = (IScopeValue) currentTree;
                Map<String, String> class2PathMap = scopeValue.getClass2PathMap();
                if (null != class2PathMap && class2PathMap.containsKey(className)) {
                    return class2PathMap.get(className);
                }
            }
            currentTree = currentTree.getParent();
        }
        return null;
    }

    /**
     * 放置函数定义
     *
     * @param tree
     * @param className
     * @param path
     */
    default void putParentClassPath(ParseTree tree, String className, String path) {
        while (tree != null) {
            ParseTree parent = tree.getParent();
            if (null == parent) {
                return;
            }
            if (parent instanceof IScopeValue) {
                IScopeValue scopeValue = (IScopeValue) parent;
                Map<String, String> class2PathMap = scopeValue.getClass2PathMap();
                class2PathMap.put(className, path);
                return;
            }
            tree = parent;
        }
    }

    default void beforeVisit(ParseTree tree, VisitProcess visitProcess) {
//        do nothing
    }

    /**
     * such as clear
     * @param tree
     * @param visitProcess
     */
    default void afterVisit(ParseTree tree, VisitProcess visitProcess) {
//        clear context
        if (null != tree && tree instanceof IScopeValue) {
            ((IScopeValue) tree).clear();
        }
    }
}
