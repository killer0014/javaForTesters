package com.javafortesters.chap004testswithotherclasses.examples;

//import com.sun.tools.jdi.IntegerValueImpl;
import org.junit.Test;
//import sun.jvm.hotspot.jdi.IntegerTypeImpl;

import static org.junit.Assert.assertEquals;

/**
 * Created by Lars on 15/02/2017.
 */
public class IntegerExamplesTest {


    @Test
    public void integerExploration() {
        Integer four = new Integer(4);
        assertEquals("intValue returns int 4", 4, four.intValue());
    }

    {
        Integer five = new Integer("5");
        assertEquals("intValue returns int 5", 5, five.intValue());
    }

    {
        Integer six = 6;
        assertEquals("autoboxing assignment for 6", 6, six.intValue());
    }

    @Test
    public void hexToString() {

        assertEquals("11 moet een b opleveren", "b", Integer.toHexString(11));

        assertEquals("10 moet een a opleveren", "a", Integer.toHexString(10));

        assertEquals("3 moet een 3 opleveren", "3", Integer.toHexString(3));

        assertEquals("21 moet een 15 opleveren", "15", Integer.toHexString(21));
    }


// Page 48
    @Test

    public void maxMinAssertion() {
        assertEquals(" Integer min value must be equal to ", -2147483648, Integer.MIN_VALUE);
        assertEquals(" Integer max value must be equal to ", 2147483647, Integer.MAX_VALUE);


    }


    //Chapter 5




    }





