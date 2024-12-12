package com.wl.zl.impl;

import com.wl.g4.ZLExpressParser;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

public class ImportVis implements ICustomVisitor<Void> {
    @Override
    public Void visit(ParseTree tree, VisitProcess visitProcess) {
        ZLExpressParser.ImportExpressionContext ctx = (ZLExpressParser.ImportExpressionContext) tree;
        ZLExpressParser.PackagePathContext packagePathContext = ctx.packagePath();
        String packagePath = packagePathContext.getText();
        System.out.println(packagePath);
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        try {
            String path = packagePath.replaceAll("\\.", "/");
            Enumeration<URL> resources = contextClassLoader.getResources(path);
            for (; resources.hasMoreElements(); ) {
                URL resource = resources.nextElement();
                System.out.println(resource);
            }
            System.out.println(resources);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.ImportExpressionContext.class;
    }
}
