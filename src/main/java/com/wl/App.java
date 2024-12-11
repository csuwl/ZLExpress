package com.wl;

import com.wl.g4.ZLExpressLexer;
import com.wl.g4.ZLExpressParser;
import com.wl.zl.impl.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.Arrays;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        ZLExpressLexer lexer = new ZLExpressLexer(CharStreams.fromString("543+765+68+32+985;210+23;"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ZLExpressParser zlExpressParser = new ZLExpressParser(tokens);

        PlusVis plusVis = new PlusVis();
        AssignVis assignVis = new AssignVis();
        ExpressionVis expressionVis = new ExpressionVis();
        DoubleConstantVis doubleConstantVis = new DoubleConstantVis();
        IntegerConstantVis integerConstantVis = new IntegerConstantVis();
        NumConstantVis numConstantVis = new NumConstantVis();
        ExprListVis exprListVis = new ExprListVis();

        VisitProcess objectVisitProcess = new VisitProcess(Arrays.asList(exprListVis, plusVis, assignVis, expressionVis, doubleConstantVis, integerConstantVis, numConstantVis));

        Result result = objectVisitProcess.visitParseTree(zlExpressParser.exprList());

        System.out.println(result);

    }
}
