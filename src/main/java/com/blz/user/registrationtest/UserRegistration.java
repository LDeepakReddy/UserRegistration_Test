package com.blz.user.registrationtest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public final String firstName = "^[A-Z]{1}[a-z]{2,}$";
    public final String lastName = "^[A-Z]{1}[a-z]{3,}$";
    public final String email = "^[a-z]{3,}(.[a-z]{3,})*@[a-z]{2,}.[a-z]{2,3}([.+_-][a-z]{2})*$";
    public final String mobileNumber = "^[0-9]{2}\s?[0-9]{10}$";
    public final String passWord = "(?=.{8,})(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z]*[@#$%_!^&*][0-9a-zA-Z]*";

    public boolean validateFirstName(String userFirstName) {
        Pattern pattern = Pattern.compile(firstName);
        Matcher matcher = pattern.matcher(userFirstName);
        if (matcher.matches())
            return true;
        else
            return false;
    }

    public boolean validateLastName(String userlastName) {
        Pattern pattern = Pattern.compile(lastName);
        Matcher matcher = pattern.matcher(userlastName);
        if (matcher.matches())
            return true;
        else
            return false;

    }

    public boolean validateEmail(String userEmail) {
        Pattern pattern = Pattern.compile(email);
        Matcher matcher = pattern.matcher(userEmail);
        if (matcher.matches())
            return true;
        else
            return false;

    }

    public boolean validateMobilenumber(String userMobile) {
        Pattern pattern = Pattern.compile(mobileNumber);
        Matcher matcher = pattern.matcher(userMobile);
        if (matcher.matches())
            return true;
        else
            return false;
    }

    public boolean validatePassword(String userPassword) {
        Pattern pattern = Pattern.compile(passWord);
        Matcher matcher = pattern.matcher(userPassword);
        if (matcher.matches())
            return true;
        else
            return false;
    }

    public String analyzeMoodSad(String msg) {
        if (msg.toLowerCase().contains("sad"))
            return "sad";
        return null;
    }
    public String analyzeMoodHappy(String msg) {
        if (msg.toLowerCase().contains("happy"))
            return "happy";
        return null;

    }
}




