package com.javafortesters.chap007basicsofJava.examples;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;



public class Chap7Test {

    /*
     * This code checks that the true value that truthy was set to is true.
     * Pretty obvious really.
     */

 
    
   
    @Test
    public void testTrueBoolean() {
       boolean truthy = true;
    assertTrue(truthy);
    
    }
    @Test
    public void testFalseBoolean() {
       boolean truthy = false;
    assertFalse(truthy);
    
    }

}