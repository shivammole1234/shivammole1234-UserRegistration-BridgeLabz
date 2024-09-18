package com.bridgeLabz.userRegi;

import junit.framework.TestCase;
import junit.framework.TestResult;
import org.junit.Test;

public class UserRegistrationTest extends TestCase {

    UserRegistration user_regi=new UserRegistration();

    @Test
    public void test_when_valid_fname_should_return_True(){
        boolean A_result=user_regi.validate_first_name("Shivam");
        assertTrue(A_result);
        assertTrue(user_regi.validate_first_name("Shiv"));
        assertTrue(user_regi.validate_first_name("Kia"));
        assertTrue(user_regi.validate_first_name("Kiaa"));
        assertTrue(user_regi.validate_first_name("Julie"));

    }

    @Test
    public void test_when_invalid_fname_should_return_False(){
        assertFalse(user_regi.validate_first_name("shivam"));
        assertFalse(user_regi.validate_first_name("shiv"));
        assertFalse(user_regi.validate_first_name("kia"));
        assertFalse(user_regi.validate_first_name("kiya"));
    }

    @Test
    public void test_null_first_name_return_false(){
        assertFalse(user_regi.validate_first_name(null));

    }

    public void test_too_Short_fname_return_false(){
        assertFalse(user_regi.validate_first_name("Ki"));
        assertFalse(user_regi.validate_first_name("ki"));
    }


}