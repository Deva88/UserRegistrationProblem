package com.userregistration;

import java.util.*;
import java.util.regex.*;

/*
@description: class to checking Password  
by regular expression

@parameters: defining a method passwordCheck() to check Password 
Minimum 8 Character, 
least 1 Upper case and 
least 1 numeric number 
1 Special Character using regular expression 
 */
public class UserRegistration {

	// method to check Password is valid or not by using regular expression
	public static boolean passwordCheck() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter minimum 8 Character password : ");
		String password = sc.next();

		// Regular Expressions
		if (Pattern.matches("[\\S]{8,}", password) && Pattern.matches(".*[A-Z].*", password)
				&& Pattern.matches(".*[0-9].*", password) && Pattern.matches(".*[\\W]{1}.*", password)) {
			System.out.println("Password valid");
			return true;
		} else {
			System.out.println("Password invalid");
			return passwordCheck();
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to user registration");
		passwordCheck();
	}

}