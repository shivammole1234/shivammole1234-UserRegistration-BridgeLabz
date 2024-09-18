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
    public void test_when_valid_lname_should_return_True(){
        boolean A_result=user_regi.validate_first_name("Mole");
        assertTrue(A_result);
        assertTrue(user_regi.validate_first_name("Smith"));
        assertTrue(user_regi.validate_first_name("Xender"));
        assertTrue(user_regi.validate_first_name("Tiaa"));
        assertTrue(user_regi.validate_first_name("Julie"));

    }

    @Test
    public void test_when_invalid_lname_should_return_False(){
        assertFalse(user_regi.validate_first_name("mole"));
        assertFalse(user_regi.validate_first_name("xeder"));
        assertFalse(user_regi.validate_first_name("bill"));
        assertFalse(user_regi.validate_first_name("gate"));
    }

    @Test
    public void test_null_first_name_return_false(){
        assertFalse(user_regi.validate_first_name(null));

    }

    public void test_too_short_fname_return_false(){
        assertFalse(user_regi.validate_first_name("Xe"));
        assertFalse(user_regi.validate_first_name("Mo"));
    }

    @Test
    public void test_null_l_name_return_false(){
        assertFalse(user_regi.validate_first_name(null));

    }

    public void test_too_Short_lname_return_false(){
        assertFalse(user_regi.validate_first_name("Xe"));
        assertFalse(user_regi.validate_first_name("Mo"));
    }



}