package com.wl;

import com.wl.g4.ZLExpressLexer;
import com.wl.g4.ZLExpressParser;
import com.wl.main.ZLExpress;
import com.wl.zl.impl.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.Arrays;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ZLExpress zlExpress = new ZLExpress();
        Object process = zlExpress.process("int dsa(int sm,int dsa){\n" +
                "  return sm+dsa;\n" +
                "};\n" +
                "dsa(45,76);", null, null);

        System.out.println(process);

    }
}
