package com.csuwl;

import com.csuwl.innerfunction.IInnerFunctionInterface;
import com.csuwl.main.ZLExpress;
import com.csuwl.util.NumUtil;
import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {

        ZLExpress zlExpress = new ZLExpress(true);
        Object process = zlExpress.process(" id = -43 ; id==-43;", null, null);
        assertEquals(process, true);
    }

    public void testCompare() {

        ZLExpress zlExpress = new ZLExpress(false);
        Object process = zlExpress.process(" id >53 || id==null", null, null);
        System.out.println(process);
        assertEquals(process, true);
    }

    public void testAssign() {
        try {
            ZLExpress zlExpress = new ZLExpress(false);
            Object process = zlExpress.process("\n" +
                    "import java.util.Date;\n" +
                    "Date sa = new Integer(\"765\");Array ds=[543];", null, null);
            System.out.println(process);
        } catch (Exception e) {
        }

    }

    public void testImport() {

        try {
            ZLExpress zlExpress = new ZLExpress(false);
            Object process = zlExpress.process("import java.util.Date as dd;\n" +
                    "Date sa = new dd(); Array ds=[543];", null, null);
            System.out.println(process);
        } catch (Exception e) {
        }

        ZLExpress zlExpress = new ZLExpress(false);
        Object process = zlExpress.process("import java.util.Date as dd;\n" +
                "dd sa = new dd(); Array ds=[543];", null, null);
        System.out.println(process);


        try {
            zlExpress = new ZLExpress(false);
            process = zlExpress.process("dd sa = new Date(); Array ds=[543];", null, null);
            System.out.println(process);
        } catch (Exception e) {
        }
    }

    public void testImport2() {
        try {
            ZLExpress zlExpress = new ZLExpress(false);
            Object process = zlExpress.process("import java.util.Date; dd sa = new Date(); Array ds=[543];", null, null);
            System.out.println(process);
        } catch (Exception e) {
        }
    }

    public void testArray() {
//        Array ds=[543];
        ZLExpress zlExpress = new ZLExpress(false);
        Object process = zlExpress.process("Array ds=[543]; return ds;", null, null);
        Assert.assertEquals(process, Arrays.asList(543));
    }

    public void testArray2() {
        ZLExpress zlExpress = new ZLExpress(false);
        Object process = zlExpress.process("543 in [748,654,87,543,654,7654];", null, null);
        Assert.assertEquals(process, true);
        Object process2 = zlExpress.process("[543] in [748,654,87,543,654,7654];", null, null);
        System.out.println(process2);
        Assert.assertEquals(process2, false);
    }

    public void testCompareNum() {
        Double v = new Double("543.00");
        Integer i = new Integer("543");
        BigDecimal bigDecimal = new BigDecimal("76457");

        int i1 = NumUtil.compareBigDecimal(v, i);
    }

    public void testCompute() {
        ZLExpress zlExpress = new ZLExpress(false);
        Object process2 = zlExpress.process("ds=5432.0;ds+43;", null, null);
        System.out.println(process2);
    }

    public void testAgoDay() {
        ZLExpress zlExpress = new ZLExpress(false);
        Object process2 = zlExpress.process("dds=now();\n" +
                "dds agoDay 3;", null, null);
        System.out.println(process2);
        Assert.assertEquals(process2, false);

        zlExpress = new ZLExpress(false);
        process2 = zlExpress.process("dds='2024-12-01';\n" +
                "dds agoDay 3;", null, null);
        System.out.println(process2);
        Assert.assertEquals(process2, true);
    }


    public void testRecentDay() {
        ZLExpress zlExpress = new ZLExpress(false);
        Object process2 = zlExpress.process("dds=now();\n" +
                "dds recentDay 3;", null, null);
        System.out.println(process2);
        Assert.assertEquals(process2, true);

        zlExpress = new ZLExpress(false);
        process2 = zlExpress.process("dds='2024-12-01';\n" +
                "dds recentDay 3;", null, null);
        System.out.println(process2);
        Assert.assertEquals(process2, false);
    }


    public void testFunctionCompute(){
        ZLExpress zlExpress = new ZLExpress(false);
        Object process = zlExpress.process("x=543;\n" +
                "a=65;\n" +
                "c=0.543;\n" +
                "\n" +
                "y=a*x+c;\n" +
                "\n" +
                "int ds(){\n" +
                "  return y*x+c;\n" +
                "};\n" +
                "\n" +
                "ds();", null, null);
        System.out.println(process);
        Assert.assertEquals(process, 1.9165480392E7);
    }
}
