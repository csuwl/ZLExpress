package com.csuwl.zl.impl.highprecise;


import com.csuwl.g4.ZLExpressParser;
import com.csuwl.model.AssignModel;
import com.csuwl.model.Result;
import com.csuwl.util.AssignUtil;
import com.csuwl.zl.ICustomVisitor;
import com.csuwl.zl.IHighPreciseCustomVisitor;
import com.csuwl.zl.VisitProcess;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;


/**
 * 赋值
 */
public class AssignVis implements IHighPreciseCustomVisitor {

    @Override
    public Result visit(ParseTree tree, VisitProcess visitProcess) {
        ZLExpressParser.AssignExpressionContext ctx = (ZLExpressParser.AssignExpressionContext) tree;
        AssignModel assignModel = AssignUtil.getAssignModel(ctx, visitProcess, true);

        putParentContext(tree, assignModel.getId(), assignModel.getValue());
        return new Result(null);
    }

    @Override
    public Class<? extends ParserRuleContext> getProcessType() {
        return ZLExpressParser.AssignExpressionContext.class;
    }


}
