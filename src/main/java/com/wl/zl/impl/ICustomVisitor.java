package com.wl.zl.impl;

import com.wl.g4.ZLExpressParser;
import com.wl.model.FunctionDefinition;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;
import java.util.Map;

/**
 * @author wanglei
 * @param <T>
 */
public interface ICustomVisitor<T> {

    T visit(ParseTree tree, VisitProcess visitProcess);

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
    };

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
    };


    /**
     * 查找函数定义
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
     *
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
}
