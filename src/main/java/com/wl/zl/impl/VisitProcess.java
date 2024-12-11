package com.wl.zl.impl;

import com.wl.g4.ZLExpressBaseVisitor;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

public class VisitProcess {

    private List<ICustomVisitor> visitorList = new ArrayList<ICustomVisitor>();

    public VisitProcess(List<ICustomVisitor> visitorList) {
        this.visitorList = visitorList;
    }

    public Result visitParseTree(ParseTree tree) {
        for (ICustomVisitor visitor : this.visitorList) {
            Class<? extends ParseTree> processType = visitor.getProcessType();
            if (processType.isInstance(tree)) {
                Object object = visitor.visit(tree, this);
                return new Result(object, null == object ? null : object.getClass());
            }
        }
        return visitChildren(tree);
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
