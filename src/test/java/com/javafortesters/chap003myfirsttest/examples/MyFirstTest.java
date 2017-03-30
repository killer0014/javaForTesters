package com.javafortesters.chap003myfirsttest.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Lars on 26/01/2017.
 */
public class MyFirstTest {




    @Test
    public void canSubstractTwoMinusTwo_chekfor5() {
        int answer = 2 - 2;
        assertEquals("2-2=0", 0, answer);
    }
    @Test
    public void canDivideFourByTwo() {
        int answer = 4 / 2;
        assertEquals("4/2=2", 2, answer);
    }
    @Test
    public void canMulitplieTwoTimesTwo() {
        int answer = 2 * 2;
        assertEquals("2x2=4", 4, answer);
    }
    @Test
    public void canAddTwoPlusTwoCheckForFive() {
        int answer = 2 + 2;
        assertEquals("2+2=4", 5, answer);
    }
}




