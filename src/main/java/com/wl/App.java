package com.wl;

import com.wl.zl.ZLExpressLexer;
import com.wl.zl.ZLExpressParser;
import com.wl.zl.impl.Add;
import com.wl.zl.impl.Assign;
import com.wl.zl.impl.VisitProcess;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.Arrays;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        ZLExpressLexer lexer = new ZLExpressLexer(CharStreams.fromString("d1=423;d2=543;d3=d1+d2;"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ZLExpressParser zlExpressParser = new ZLExpressParser(tokens);

        Add<Object> objectAdd = new Add<>();
        Assign<Object> objectAssign = new Assign<>();

        VisitProcess<Object> objectVisitProcess = new VisitProcess<>(Arrays.asList(objectAssign,objectAdd));

        objectVisitProcess.visit(zlExpressParser.expression());


        System.out.println();
    }
}
