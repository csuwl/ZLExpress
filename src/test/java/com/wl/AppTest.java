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
        Object process = zlExpress.process("int i=300;\n" +
                "print(i);\n" +
                "\n" +
                "for(int i=0;i<40;i++){ \n" +
                "    if(i<=10){\n" +
                "        continue;\n" +
                "    };\n" +
                "   print(i); \n" +
                " };\n" +
                " \n" +
                "print(\"结束\",\" \",i);", null, null);

    }
}
