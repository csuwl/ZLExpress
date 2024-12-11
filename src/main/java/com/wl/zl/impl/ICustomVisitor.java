package com.wl.zl.impl;

import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Map;

public interface ICustomVisitor<T> {

    T visit(ParseTree tree, VisitProcess visitProcess);

    public Class<? extends ParseTree> getProcessType();


    default Object resolveContext(ParseTree tree, Object key) {

        ParseTree currentTree = tree;
        while (currentTree != null) {
            if (tree instanceof IScopeValue) {
                IScopeValue scopeValue = (IScopeValue) tree;
                Map<Object, Object> context = scopeValue.getContext();
                if (null!= context && context.containsKey(key)) {
                    return context.get(key);
                }
            }
            currentTree = currentTree.getParent();
        }
        return null;
    };

    default void putGloable(ParseTree tree, Object key, Object value) {

        while (tree != null) {
            ParseTree parent = tree.getParent();
            if(null == parent){
                break;
            }
            tree = parent;
        }
        IScopeValue scopeValue = (IScopeValue) tree;
        scopeValue.getContext().put(key, value);
    };
}
