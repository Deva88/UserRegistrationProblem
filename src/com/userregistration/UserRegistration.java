package com.userregistration;

import java.util.*;
import java.util.regex.*;
/*
@description: class to checking user Phone Number 
by regular expression
@parameters: defining a method mobileNo() to
check Phone Number is valid with country code using regular expression 
 */
public class UserRegistration {

	
	//method to check Phone Number is valid or not by using regular expression
	public static boolean mobileNo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mobile number: ");
		String mobile = sc.next();
		// Using REGEX
		if (Pattern.matches("(0|91)?[6-9][0-9]{9}", mobile)) {
			System.out.println("valid");
			return true;
		} else {
			System.out.println("Invalid");
			return mobileNo();
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to user registration");
		mobileNo();
	}

}