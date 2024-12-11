package com.wl.zl.impl;

import com.wl.g4.ZLExpressParser;
import org.antlr.v4.runtime.tree.ParseTree;

public class TextConstantVis implements ICustomVisitor<String> {
    @Override
    public String visit(ParseTree tree, VisitProcess visitProcess) {
        ZLExpressParser.TextConstantContext ctx = (ZLExpressParser.TextConstantContext) tree;
        String text = ctx.getText();
        text = text.substring(1, text.length() - 1);
        return text;
    }

    @Override
    public Class<? extends ParseTree> getProcessType() {
        return ZLExpressParser.TextConstantContext.class;
    }
}
