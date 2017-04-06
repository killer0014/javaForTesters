package com.javafortesters.chap006domainentities.examples;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.javafortesters.domainentities.User;

public class UserTest {

    @Test
    public void canConstructANewUser() {
	User user = new User();

    }

    @Test
    public void userHasDefaultUsernameAndPassword() {
	User user = new User();
	assertEquals("default username expected", "username", user.getUsername());
	assertEquals("default password expected", "password", user.getPassword());
    }
// page 72 of book java4testers
    @Test
    public void changeFieldsToPublic() {
	User auser = new User();
	auser.username = "bob";
	assertEquals("not default username", "bob", auser.username);
    }

}
