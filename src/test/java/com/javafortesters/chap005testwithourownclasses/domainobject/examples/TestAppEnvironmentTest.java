package com.javafortesters.chap005testwithourownclasses.domainobject.examples;

import org.junit.Test;

//import static org.junit.Assert.assertEquals;
import org.junit.Assert;


/**
 * Created by Lars on 23/02/2017.
 */
public class TestAppEnvironmentTest {

    @Test
    public void canGetUrlStatically() {
        Assert.assertEquals("Returns hard coded url", "http://192.123.0.3:67");
        TestAppEnv.getUrl();
    }






    @Test
    public void canGetDomainAndPortStatically() {
        Assert.assertEquals("Just the Domain",
                "192.123.0.3",
                TestAppEnv.DOMAIN);
        Assert.assertEquals("Just the port",
                "67",
                TestAppEnv.PORT);
    }
}



// page 61 java4Testers