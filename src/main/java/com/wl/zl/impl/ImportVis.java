package com.wl.zl.impl;

import com.wl.g4.ZLExpressParser;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

public class ImportVis implements ICustomVisitor<Void> {
    @Override
    public Void visit(ParseTree tree, VisitProcess visitProcess) {
        ZLExpressParser.ImportExpressionContext ctx = (ZLExpressParser.ImportExpressionContext) tree;
        ZLExpressParser.PackagePathContext packagePathContext = ctx.packagePath();
        String packagePath = packagePathContext.getText();
        List<ZLExpressParser.IdContext> idContexts = ctx.getRuleContexts(ZLExpressParser.IdContext.class);

        String id = null;
        if (null != idContexts && idContexts.size() != 0) {
            id = idContexts.get(0).getText();
        } else {
            String[] pathArray = packagePath.split("\\.");
            id = pathArray[pathArray.length - 1];
        }

        try {
            Class.forName(packagePath);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        putParentClassPath(tree, id, packagePath);

        return null;
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.ImportExpressionContext.class;
    }
}
