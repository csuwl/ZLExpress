package com.csuwl;

import com.csuwl.innerfunction.IInnerFunctionInterface;
import com.csuwl.main.ZLExpress;
import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

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


        zlExpress = new ZLExpress(false);
        process = zlExpress.process("dd sa = new Date(); Array ds=[543];", null, null);
        System.out.println(process);
    }

    public void testImport2() {
        try {
            ZLExpress zlExpress = new ZLExpress(false);
            Object process = zlExpress.process("import java.util.Date; dd sa = new Date(); Array ds=[543];", null, null);
            System.out.println(process);
        } catch (Exception e) {
        }
    }

    public void testArray(){
//        Array ds=[543];
            ZLExpress zlExpress = new ZLExpress(false);
            Object process = zlExpress.process("Array ds=[543]; return ds;", null, null);
            Assert.assertEquals(process, Arrays.asList(543));
    }

    public void testArray2(){
        ZLExpress zlExpress = new ZLExpress(false);
        Object process = zlExpress.process("543 in [748,654,87,543,654,7654];", null, null);
        Assert.assertEquals(process, true);
        Object process2 = zlExpress.process("[543] in [748,654,87,543,654,7654];", null, null);
        System.out.println(process2);
        Assert.assertEquals(process2, false);
    }
}
