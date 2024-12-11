package com.wl.zl.impl;

import com.wl.g4.ZLExpressBaseVisitor;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

public class VisitProcess<T> extends ZLExpressBaseVisitor<T> {

    private List<ICustomVisitor<T>> visitorList = new ArrayList<ICustomVisitor<T>>();

    public VisitProcess(List<ICustomVisitor<T>> visitorList) {
        this.visitorList = visitorList;
    }

    public T visitParseTree(ParseTree tree) {
        for (ICustomVisitor<T> visitor : this.visitorList) {
            Class<? extends ParseTree> processType = visitor.getProcessType();
            if (processType.isInstance(tree)) {
                return visitor.visit(tree, this);
            }
        }
        return null;
    }


    public T visitChildren(ParseTree tree) {
        for (int i = 0; i < tree.getChildCount(); i++) {
            ParseTree child = tree.getChild(i);
            visitParseTree(child);
        }
        return null;
    }


}
