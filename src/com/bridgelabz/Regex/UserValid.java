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
}