package com.bridgelabz.Regex;

public class Main {
    public static void main(String[] args) {

        UserValid userValid = new UserValid();
        userValid.checkFirstName();
        userValid.checkLastName();
        userValid.checkValidMail();
        userValid.checkMobileNumber();
        userValid.checkPassword();
        userValid.checkPasswordWithAtLeastOneUpperCase();
        userValid.passwordWithOneNumericNum();
    }
}