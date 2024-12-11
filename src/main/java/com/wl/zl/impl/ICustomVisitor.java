package com.wl.zl.impl;

import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Map;

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
}
