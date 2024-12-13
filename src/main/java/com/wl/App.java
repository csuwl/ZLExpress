package com.wl;

import com.wl.g4.ZLExpressLexer;
import com.wl.g4.ZLExpressParser;
import com.wl.main.ZLExpress;
import com.wl.zl.impl.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ZLExpress zlExpress = new ZLExpress();
        Object process = zlExpress.process("import java.math.BigInteger;\n" +
                "bigInteger = new BigInteger(\"543\");\n" +
                "addSub = bigInteger.add(bigInteger);", null, null);

        BigInteger bigInteger = new BigInteger("543");
        BigInteger addSub = bigInteger.add(bigInteger);

        System.out.println(addSub);
        System.out.println(process);

    }
}
