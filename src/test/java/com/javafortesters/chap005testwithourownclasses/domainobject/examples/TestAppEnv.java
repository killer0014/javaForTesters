package com.javafortesters.chap005testwithourownclasses.domainobject.examples;

/**
 * Created by Lars on 29/03/2017.
 */
public class TestAppEnv {
    public static final String DOMAIN = "192.123.0.3";
    public static final String PORT = "67" ;

    public static String getUrl() {
        return "http://" + DOMAIN + ":" + PORT;
        //return null;
    }
}


//
//• ReplacetheStringwithanint.Whathappens? error in syntax, incompatible types
// • ReplacetheStringliteral"http://192.123.0.3:67"withnullandrun
//        the @Test method. What happens? test runs ok passes

