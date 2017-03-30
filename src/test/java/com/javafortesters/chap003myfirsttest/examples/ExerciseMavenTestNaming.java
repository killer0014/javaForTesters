package com.javafortesters.chap003myfirsttest.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Lars on 15/02/2017.
 */
public class ExerciseMavenTestNaming {

    @Test
    public void assertTrue() {
        boolean input = false;
        assertEquals("Boolean=false", true, input);
    }


    @Test
    public void canAddTwoPlusTwo() {
        int answer = 2 + 2;
        assertEquals("2+2=4", 4, answer);
    }

}