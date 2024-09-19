package com.bridgeLabz.userRegi;

import junit.framework.TestCase;
import junit.framework.TestResult;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class UserRegistrationTest extends TestCase {

    UserRegistration user_regi=new UserRegistration();

    /// array of valid emails
    private String[] valid_emails = {
            "abc@yahoo.com",
            "abc-100@yahoo.com",
            "abc.100@yahoo.com",
            "abc111@abc.com",
            "abc-100@abc.net",
            "abc.100@abc.com.au",
            "abc@1.com",
            "abc@gmail.com.com",
            "abc+100@gmail.com"
    };

     private String[] invalid_emails = {
             "abc",
             "abc@.com.",
             "abc123@gmail.a",
             "abc123@.com",
             "abc123@.cocom",
             ".abc@abc.com",
             "abc()*@gmail.com",
             "abc@%*.com",
             "abc..2002@gmail.com",
             "abc.@gmail.com",
             "abc@abc@gmail.com",
             "abc@gmail.com.1a",
             "abc@gmail.com.aa.au"
    };

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

    @Test
    public void test_too_Short_lname_return_false(){
        assertFalse(user_regi.validate_first_name("Xe"));
        assertFalse(user_regi.validate_first_name("Mo"));
    }

    @Test
    public void test_valid_email_return_True(){
        for(String email :valid_emails){
            assertTrue("Email Validation failed for :- "+email,user_regi.validate_email(email));
        }
    }


    @Test
    public void test_invalid_emial_return_false(){
        for(String mail:invalid_emails){
            assertFalse("Email validation failed for :- "+mail,user_regi.validate_email(mail));
        }
    }


    //mobile number
    @Test
    public void test_valide_mobile_number_return_true(){
        assertTrue(user_regi.validate_mobile_number("91 8378923562"));
    }

    @Test
    public void test_too_short_mobile_return_false(){
        assertFalse(user_regi.validate_mobile_number("91 85214796"));
    }

    @Test
    public void test_without_space_mobile_return_false(){
        assertFalse(user_regi.validate_mobile_number("914789652310"));
    }

    @Test
    public void test_too_short_mobile_reurn_false(){
        assertFalse(user_regi.validate_mobile_number("91 8521479"));
    }

    // password matching
    @Test
    public void test_invalid_password_return_false(){
        assertFalse(user_regi.validate_password("password"));
    }

    @Test
    public void test_invalid_password_too_short() {
        assertFalse(user_regi.validate_password("passw"));
    }

    @Test
    public void test_valid_password_minimum_length() {
        assertTrue(user_regi.validate_password("Passw0rd!"));
    }

    @Test
    public void test_invalid_password_missing_uppercase() {
        assertFalse(user_regi.validate_password("password1@"));
    }

    @Test
    public void test_valid_password_with_uppercase() {
        assertTrue(user_regi.validate_password("Password1@"));
    }

    @Test
    public void test_invalid_password_missing_numeric() {
        assertFalse(user_regi.validate_password("Password@"));
    }

    @Test
    public void test_valid_password_with_numeric() {
        assertTrue(user_regi.validate_password("Passw0rd@"));
    }

    @Test
    public void test_invalid_password_multiple_special_characters() {
        assertFalse(user_regi.validate_password("Passw0rd@@"));
    }

    @Test
    public void test_invalid_password_missing_special_character() {
        assertFalse(user_regi.validate_password("Passw0rd1"));
    }

    @Test
    public void test_valid_password_with_one_special_character() {
        assertTrue(user_regi.validate_password("Passw0rd@"));
    }

    @Test
    public void test_all_test_cases_in_one_method(){

        // First Name Tests
        assertTrue("Valid first name failed", user_regi.validate_first_name("Shivam"));  // Happy Case
        assertFalse("Invalid first name passed", user_regi.validate_first_name("shivam"));  // Sad Case
        assertFalse("Too short first name passed", user_regi.validate_first_name("Jo"));  // Sad Case

        // Last Name Tests
        assertTrue("Valid last name failed", user_regi.validate_last_name("Mole"));  // Happy Case
        assertFalse("Invalid last name passed", user_regi.validate_last_name("mole"));  // Sad Case
        assertFalse("Too short last name passed", user_regi.validate_last_name("Li"));  // Sad Case

        // Email Tests
        assertTrue("Valid email failed", user_regi.validate_email("abc.xyz@bl.co.in"));  // Happy Case
        assertFalse("Invalid email passed", user_regi.validate_email("abc@.com"));  // Sad Case

        // Mobile Number Tests
        assertTrue("Valid mobile number failed", user_regi.validate_mobile_number("91 9919819801"));  // Happy Case
        assertFalse("Invalid mobile number passed", user_regi.validate_mobile_number("919919819801"));  // Sad Case
        assertFalse("Too short mobile number passed", user_regi.validate_mobile_number("91 99198"));  // Sad Case

        // Password Tests
        assertTrue("Valid password failed", user_regi.validate_password("Passw0rd@"));  // Happy Case
        assertFalse("Password without special character passed", user_regi.validate_password("Passw0rd1"));  // Sad Case
        assertFalse("Password without uppercase passed", user_regi.validate_password("password@1"));  // Sad Case
        assertFalse("Too short password passed", user_regi.validate_password("Pass1@"));  // Sad Case

    }

    // parameterize test case for email

    @Test
    @DisplayName("vlidating multiple valid email in one method")
    @ParameterizedTest
    @ValueSource(strings = {
            "abc@yahoo.com",
            "abc-100@yahoo.com",
            "abc.100@yahoo.com",
            "abc111@abc.com",
            "abc-100@abc.net",
            "abc.100@abc.com.au",
            "abc@1.com",
            "abc@gmail.com.com",
            "abc+100@gmail.com"
    })
    public void test_para_testcases_for_valid_email(String email){
        assertTrue(" Valid email vailedd for:- "+email,user_regi.validate_email(email));
    }

    @Test
    @DisplayName("vlidating multiple invalid email in one method")
    @ParameterizedTest
    @ValueSource(strings = {
            "abc",
            "abc@.com.",
            "abc123@gmail.a",
            "abc123@.com",
            "abc123@.cocom",
            ".abc@abc.com",
            "abc()*@gmail.com",
            "abc@%*.com",
            "abc..2002@gmail.com",
            "abc.@gmail.com",
            "abc@abc@gmail.com",
            "abc@gmail.com.1a",
            "abc@gmail.com.aa.au"
    })
    public void test_para_testcases_for_invalid_email(String email){
        assertTrue(" Valid email vailedd for:- "+email,user_regi.validate_email(email));
    }






}