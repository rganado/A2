package org.proofguru.com;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class Tester 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public Tester( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( Tester.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    public void testAddition1() {
		Calculator calculator = new Calculator();
    	assertEquals(2, calculator.add(1, 1));
	}

    public void testAddition2() {
		Calculator calculator = new Calculator();
    	assertEquals(7, calculator.add(3, 4));
	}

    public void testAddition3() {
		Calculator calculator = new Calculator();
    	assertEquals(10, calculator.add(5, 5));
	}

    public void testSubtraction1() {
		Calculator calculator = new Calculator();
    	assertEquals(2, calculator.subtract(5,3));
	}

    public void testSubtraction2() {
		Calculator calculator = new Calculator();
    	assertEquals(4, calculator.subtract(12,8));
	}
	
}
