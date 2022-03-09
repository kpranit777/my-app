package com.mycompany.app;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
        System.out.println("must insert true");
    }
    
    @Test
    public void shouldAnswerWithFalse()
    {
        assertFalse( false );
        System.out.println("must insert false");
    }
}
