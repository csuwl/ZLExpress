package com.wl;

import com.wl.main.ZLExpress;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.Date;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
        Date date = new Date();
        ZLExpress zlExpress = new ZLExpress();
        Object process = zlExpress.process("if(i==654){\n" +
                "   print(\"654\");\n" +
                "   return ds;\n" +
                "}else{\n" +
                "   print(\"fdsonag\");\n" +
                "  return dsa;\n" +
                "} ;\n" +
                "int sa=dfsa;", null, null);

    }
}
