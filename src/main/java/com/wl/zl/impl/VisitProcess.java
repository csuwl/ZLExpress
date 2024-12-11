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

    public Object visitParseTree(ParseTree tree) {
        for (ICustomVisitor visitor : this.visitorList) {
            Class<? extends ParseTree> processType = visitor.getProcessType();
            if (processType.isInstance(tree)) {
              return  visitor.visit(tree,this);
            }
        }
        return null;
    }


    public Object visitChildren(ParseTree tree) {
        Object result = null;
        for (int i = 0; i < tree.getChildCount(); i++) {
            ParseTree child = tree.getChild(i);
            result = visitParseTree(child);
        }
        return result;
    }


}
