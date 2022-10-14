package com.bridgelabz.Regex;
import java.util.Scanner;
import java.util.regex.Pattern;
public class UserValid {
    Scanner scan = new Scanner(System.in);

    public void checkFirstName() {
        // Method To Check First Name With Regex Start With Cap And 3 Min. Character
        System.out.println("Enter the first Name :");
        String firstName = scan.nextLine();

        if (Pattern.matches("^[A-Z][a-z]{2,}", firstName)) {
            System.out.println("First Name is Valid");
        } else {
            System.out.println("First Name Invalid");
        }
    }
    public void checkLastName() {
        // Method To Check Last Name With Regex Start With Cap And 3 Min. Character
        System.out.println("Enter the Last Name :");
        String lastName = scan.nextLine();

        if (Pattern.matches("^[A-Z][a-z]{2,}$", lastName)) {
            System.out.println("Last Name is Valid");
        } else {
            System.out.println("Last Name Invalid");
        }
    }
    public void checkValidMail(){
        //Method to check Valid Mail with Regex
        System.out.println("Enter The Mail : ");
        String mail = scan.nextLine();

        if (Pattern.matches("^[a-zA-Z1-9_\\-\\.]+@[a-z]+\\.[a-z]{2,3}$",mail)){
            System.out.println("Mail Is Valid");
        }else {
            System.out.println("Mail Is Invalid");

        }
    }
    public void checkMobileNumber(){
        // check Mobile Number 91 country code
        System.out.println("Enter The Mobile Number With County Code : ");
        String mobileNumber = scan.nextLine();

        if (Pattern.matches("^[91]+(\\s)+[6-9][1-9]{9}$",mobileNumber)){
            System.out.println("Valid Mobile Number");
        }else {
            System.out.println("Invalid Mobile Number");
        }
    }
    public void checkPassword(){
        // check 8 Character Password
        System.out.println("Enter The Valid Password : ");
        String password = scan.nextLine();

        if (Pattern.matches("^[A-Za-z1-8]{8}$",password)){
            System.out.println("Valid Password");
        }else {
            System.out.println("Invalid Password, Enter Again");
        }
    }
    public void checkPasswordWithAtLeastOneUpperCase(){
        //At Least One UpperCase
        System.out.println("Enter The Password With At Least One Upper Case : ");
        String password1 = scan.nextLine();

        if (Pattern.matches("^[A-Z]+[a-z]{7}$",password1)){
            System.out.println("Valid Password");
        }else {
            System.out.println("Invalid Password , Enter Again");
        }
    }
    public void passwordWithOneNumericNum(){
        //At least One Numeric Number
        System.out.println("Enter The Password With At least One Numeric Number :");
        String password2 = scan.nextLine();

        if (Pattern.matches("^[1-9]+[1-9A-Za-z]{7}+",password2)){
            System.out.println("Valid Password");
        }else {
            System.out.println("Invalid Password, Enter Again ");
        }
    }
    public void passwordWithOneSpecialCharacter(){
        //Special Character
        System.out.println("Enter Password With At Least One Character : ");
        String password3 = scan.nextLine();

        if (Pattern.matches("^[a-z](?=.*[A-Z])(?=.*[1-9])(?=.*[@#$%^&+=]).{8,}$", password3)) {
            System.out.println("Valid Mail");
        }else {
            System.out.println("Invalid Mail, Enter Again ");
        }
    }
}