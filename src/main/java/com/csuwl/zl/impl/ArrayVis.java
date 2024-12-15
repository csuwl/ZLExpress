package com.csuwl.zl.impl;

import com.csuwl.g4.ZLExpressParser;
import com.csuwl.model.Result;
import com.csuwl.zl.ICustomVisitor;
import com.csuwl.zl.VisitProcess;
import org.antlr.v4.runtime.tree.ParseTree;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * array process
 * @author wanglei
 */
public class ArrayVis implements ICustomVisitor {
    @Override
    public Result visit(ParseTree tree, VisitProcess visitProcess) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        ZLExpressParser.ArrayContext arrayContext = (ZLExpressParser.ArrayContext) tree;
        List<ZLExpressParser.ArrayContentContext> arrayContentContextList = arrayContext.arrayContent();
        ArrayList<Object> arrayList = new ArrayList<>(arrayContentContextList.size());
        for(ZLExpressParser.ArrayContentContext arrayContentContext : arrayContentContextList){
            Result result = visitProcess.visitParseTree(arrayContentContext);
            arrayList.add(result.getResult());
        }
        return new Result(arrayList);
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.ArrayContext.class;
    }
}
