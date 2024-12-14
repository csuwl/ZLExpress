package com.csuwl;

import com.csuwl.innerfunction.IInnerFunctionInterface;
import com.csuwl.main.ZLExpress;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.Date;
import java.util.Iterator;
import java.util.ServiceLoader;

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

        ZLExpress zlExpress = new ZLExpress(true);
        Object process = zlExpress.process(" -43", null, null);
        System.out.println( process );
    }
}
