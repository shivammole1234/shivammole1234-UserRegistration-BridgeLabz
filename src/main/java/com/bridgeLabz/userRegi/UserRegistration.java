package com.bridgeLabz.userRegi;
import java.util.regex.Pattern;
import  java.util.regex.Matcher;

public class UserRegistration {

    public boolean validate_first_name(String first_name){
        String first_name_regex="^[A-Z][a-zA-Z]{2,}$";

        Pattern pattern=Pattern.compile(first_name_regex);

        if(first_name == null)
            return  false;

        Matcher matcher = pattern.matcher(first_name);
        return matcher.matches();
    }

    public boolean validate_last_name(String last_name){
        String last_name_regex="^[A-Z][a-zA-Z]{2,}$";

        Pattern pattern =Pattern.compile(last_name_regex);

        if(last_name == null)
            return false;
        Matcher matcher = pattern.matcher(last_name);

        return matcher.matches();
    }

    public boolean validate_email(String email){
        String email_regex="^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

        Pattern pattern =Pattern.compile(email_regex);

        if(email == null)
            return false;

        Matcher matcher=pattern.matcher(email);
        return matcher.matches();
    }

    public boolean validate_mobile_number(String mobile_number){

        String mobile_number_regex = "^\\d{2} \\d{10}$";
        Pattern pattern =Pattern.compile(mobile_number_regex);

        if(mobile_number == null)
            return false;

        Matcher matcher = pattern.matcher(mobile_number);
        return matcher.matches();

    }

    public boolean validate_password(String pass){
        String pass_regex="^(?=.*[A-Z]).{8,}$";

        Pattern pattern =Pattern.compile(pass_regex);

        if(pass == null)
            return false;
        Matcher matcher=pattern.matcher(pass);
        return matcher.matches();
    }

    public static void main(String[] args) {

        UserRegistration user_regi=new UserRegistration();
        System.out.println("is Shivam valid first name :- "+user_regi.validate_first_name("shiva"));
        System.out.println("is Shivam valid first name:- "+user_regi.validate_first_name("Shivam"));

        // last name
        System.out.println("is Mole valid last name :- "+user_regi.validate_last_name("Mole"));
        System.out.println("is mole valid last name :- "+user_regi.validate_last_name("mole"));
        System.out.println("is mo valid last name:- "+user_regi.validate_last_name("mo"));

        // for email
        System.out.println("is 'abc@yahoo.com'  valid  email- "
                +user_regi.validate_email("abc@yahoo.com"));

        System.out.println("is 'abc-100@yahoo.com'  valid  email- "
                +user_regi.validate_email("abc-100@yahoo.com"));

        System.out.println("is 'abc111@abc.com'  valid  email- "
                +user_regi.validate_email("abc111@abc.com"));

        System.out.println("is 'abc123@.com'  valid  email- "
                +user_regi.validate_email("abc123@.com"));

        System.out.println("is '91 9919819801'  valid  mobile number- "
                +user_regi.validate_mobile_number("91 9919819801"));

        System.out.println("is '91 9919819800'  valid  mobile number- "
                +user_regi.validate_mobile_number("91 9919819800"));

        System.out.println("is '919919819801'  valid  mobile number- "
                +user_regi.validate_mobile_number("919919819801"));

        System.out.println("is '91 8378923562'  valid  mobile number- "
                +user_regi.validate_mobile_number("91 8378923562"));

        // password
        System.out.println("Is 'Password123' a valid password? "
                + user_regi.validate_password("Password123"));
        System.out.println("Is 'password' a valid password? "
                + user_regi.validate_password("password"));
        System.out.println("Is 'Pass123' a valid password? "
                + user_regi.validate_password("Pass123"));
        System.out.println("Is 'P@ssw0rd' a valid password? "
                + user_regi.validate_password("P@ssw0rd"));

    }
}
