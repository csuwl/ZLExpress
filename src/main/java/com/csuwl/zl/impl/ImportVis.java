package com.csuwl.zl.impl;

import com.csuwl.g4.ZLExpressParser;
import com.csuwl.model.Result;
import com.csuwl.zl.ICustomVisitor;
import com.csuwl.zl.VisitProcess;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

public class ImportVis implements ICustomVisitor {
    @Override
    public Result visit(ParseTree tree, VisitProcess visitProcess) throws ClassNotFoundException {
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

        Class.forName(packagePath);

        putParentClassPath(tree, id, packagePath);

        return new Result(null);
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.ImportExpressionContext.class;
    }
}
