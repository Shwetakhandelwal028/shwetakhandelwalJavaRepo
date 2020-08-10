package com.shweta.session6exercise.regularexpression;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EvaluateUserName {
	
	public static void evaluateFirstName(String firstName) {
		
		System.out.println(Pattern.matches("[a-zA-Z]+{1,10}", firstName ));
		
	}
	
	public static void evaluateLastName(String lastName) {
		
		System.out.println(Pattern.matches("[a-zA-Z]+{1,15}", lastName ));
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your First name");
		String firstName = input.nextLine();
		evaluateFirstName(firstName);
		System.out.println("Enter your Last Name");
		String lastName = input.nextLine();
		evaluateLastName(lastName);
		
		
		
		

	}

}
