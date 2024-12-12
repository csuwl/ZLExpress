package com.wl.zl.impl;

import com.wl.model.Result;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.HashMap;
import java.util.Map;

/**
 * process visitors
 *
 * @author wanglei
 */
public class VisitProcess {

    private Map<Class<? extends ParseTree>, ICustomVisitor> visitorMap = new HashMap<>();

    public void addVisitor(ICustomVisitor visitor) {
        visitorMap.put(visitor.getProcessType(), visitor);
    }

    public void setVisitorMap(Map<Class<? extends ParseTree>, ICustomVisitor> visitorMap) {
        this.visitorMap = visitorMap;
    }

    public VisitProcess() {
    }

    public Result visitParseTree(ParseTree tree) {
        Class<? extends ParseTree> treeClass = tree.getClass();
        ICustomVisitor visitor = visitorMap.get(treeClass);
        if (null != visitor) {
            Object object = visitor.visit(tree, this);
            return new Result(object, null == object ? null : object.getClass());
        } else {
            return visitChildren(tree);
        }

    }


    public Result visitChildren(ParseTree tree) {
        Result result = null;
        for (int i = 0; i < tree.getChildCount(); i++) {
            ParseTree child = tree.getChild(i);
            result = visitParseTree(child);
        }
        return result;
    }


}
