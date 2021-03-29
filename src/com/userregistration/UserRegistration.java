package com.userregistration;

import java.util.*;
import java.util.regex.*;

public class UserRegistration {
	/**
	 * * UC3-Validate Email user need to enter a valid Email ID valid or not.
	 * 
	 */
	public static boolean mobileNo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mobile number: ");
		String mobile = sc.next();
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