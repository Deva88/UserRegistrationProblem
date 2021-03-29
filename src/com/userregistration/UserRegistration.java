package com.userregistration;

import java.util.*;
import java.util.regex.*;

public class UserRegistration {
	/**
	 * * UC2-Validate Last name user need to enter a valid Last name Start with Cap
	 * and has minimum 3 characters
	 */
	public static boolean lastName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Last Name: ");
		String last = sc.next();
		// Using REGEX
		if (Pattern.matches("^[A-Z][aA-zZ]{2,}", last)) {
			System.out.println("Last Name valid");
			return true;
		} else {
			System.out.println("Last Name invalid");
			return lastName();
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to user registration");
		lastName();
	}

}