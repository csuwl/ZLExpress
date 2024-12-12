package com.wl.zl.impl;

import com.wl.g4.ZLExpressParser;
import com.wl.model.Result;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

/**
 * array process
 * @author wanglei
 */
public class ArrayVis implements ICustomVisitor<List<Object>>{
    @Override
    public List<Object> visit(ParseTree tree, VisitProcess visitProcess) {
        ZLExpressParser.ArrayContext arrayContext = (ZLExpressParser.ArrayContext) tree;
        List<ZLExpressParser.ArrayContentContext> arrayContentContextList = arrayContext.arrayContent();
        ArrayList<Object> arrayList = new ArrayList<>(arrayContentContextList.size());
        for(ZLExpressParser.ArrayContentContext arrayContentContext : arrayContentContextList){
            Result result = visitProcess.visitParseTree(arrayContentContext);
            arrayList.add(result.getResult());
        }
        return arrayList;
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.ArrayContext.class;
    }
}
