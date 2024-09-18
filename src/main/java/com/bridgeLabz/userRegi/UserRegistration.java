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


    public static void main(String[] args) {

        UserRegistration user_regi=new UserRegistration();
        System.out.println("is Shivam valid :- "+user_regi.validate_first_name("shiva"));
        System.out.println("is Shivam valid :- "+user_regi.validate_first_name("Shivam"));
        System.out.println("is Mole valid :- "+user_regi.validate_last_name("Mole"));
        System.out.println("is mole valid :- "+user_regi.validate_last_name("mole"));
        System.out.println("is mo valid :- "+user_regi.validate_last_name("mo"));

    }
}
