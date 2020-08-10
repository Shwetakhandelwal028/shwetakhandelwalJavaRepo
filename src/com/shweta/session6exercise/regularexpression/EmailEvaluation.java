package com.shweta.session6exercise.regularexpression;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailEvaluation {
	
	public static void evaluateEmail(String email){
		
		if(Pattern.matches("[a-zA-Z0-9]+(.+)@(.+)", email)) {
			System.out.println("Email is correct");
			
		}else {
			System.out.println("Email is not correct");
		}
	}

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your email");
		String email = input.nextLine();
		evaluateEmail(email);
	}

}
