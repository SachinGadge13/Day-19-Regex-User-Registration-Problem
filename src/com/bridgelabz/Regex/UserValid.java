package com.bridgelabz.Regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserValid {
	Scanner scan = new Scanner(System.in);

	public void checkFirstName() {
		// Method To Check First Name With Regex Start With Cap And 3 Min.
		// Character
		System.out.println("Enter the first Name :");
		String firstName = scan.nextLine();

		if (Pattern.matches("^[A-Z][a-z]{2,}", firstName)) {
			System.out.println("First Name is Valid");
		} else {
			System.out.println("First Name Invalid");
		}
	}
}