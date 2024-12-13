package com.wl.zl.impl;


import com.wl.g4.ZLExpressLexer;
import com.wl.g4.ZLExpressParser;
import com.wl.model.AssignModel;
import com.wl.model.Result;
import com.wl.util.AssignUtil;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;


/**
 * 赋值
 */
public class AssignVis implements ICustomVisitor {

    @Override
    public Result visit(ParseTree tree, VisitProcess visitProcess) {
        ZLExpressParser.AssignExpressionContext ctx = (ZLExpressParser.AssignExpressionContext) tree;
        AssignModel assignModel = AssignUtil.getAssignModel(ctx, visitProcess);

        putParentContext(tree, assignModel.getId(), assignModel.getValue());
        return new Result(null);
    }

    @Override
    public Class<? extends ParserRuleContext> getProcessType() {
        return ZLExpressParser.AssignExpressionContext.class;
    }



}
