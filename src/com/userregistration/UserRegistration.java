package com.userregistration;

import java.util.*;
import java.util.regex.*;

/*
@description: class to checking Email Samples  
by regular expression

@parameters: defining a method email() to check email using regular expression
 Validate Email user need to enter a valid Email ID valid or not. 
 */
public class UserRegistration {

	// method to check Email is valid or not by using regular expression
		public static boolean email() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter email: ");
			String email = sc.next();
			if (Pattern.matches("[a-z A-Z 0-9][a-z A-Z 0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+", email)) {

				System.out.println("Email Id valid");
				return true;
			} else {
				System.out.println("Email Id invalid");
				return email();
			}
		}

		public static void main(String[] args) {
			System.out.println("Welcome to user registration");
			email();
		}

	}