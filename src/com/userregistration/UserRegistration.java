package com.userregistration;

import java.util.*;
import java.util.regex.*;

public class UserRegistration {
	/**
	 * * UC3-Validate Email user need to enter a valid Email ID valid or not.
	 * 
	 */
	public static boolean email() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter email: ");
		String email = sc.next();
		if (Pattern.matches(
				"[_A-Za-z0-9-\\\\+]+(\\\\.[_A-Za-z0-9]+)*@\" + \"[_A-Za-z0-9-]+(\\\\.[_A-Za-z0-9]+){0,1}(\\\\.[A-Za-z]{2,})$",
				email)) {

			System.out.println("valid");
			return true;
		} else {
			System.out.println("invalid");
			return email();
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to user registration");
		email();
	}

}