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
        Object process = zlExpress.process("\n" +
                "dsaof=543;\n" +
                "dsaof++;\n" +
                "for(int i = 0; i<30;i++){\n" +
                "  i=i+1;\n" +
                "  print(i);\n" +
                "};", null, null);
        System.out.println( process );

    }
}
