package com.shweta.session6exercise.exceptionhandling;

import java.util.Scanner;

public class CalculatorThrowCustomException {
	
	
	public static void addition(int n1, int n2) {
		if(n1 >0 && n2 > 0) {
			System.out.println("Addition is "+ (n1+n2));
		}else {
			try {
				throw new AdditionException("Both the number should be greater than 0");
			} catch (AdditionException e) {
				System.out.println("Please provide valid numbers : "+e);
				
			}
		}
	}
	
	public static void substraction(int n1, int n2) {
		if(n1 > n2) {
			System.out.println("Substraction is "+ (n1-n2));
		}else {
			try {
				throw new SubstractionException("First number should be greater than second number");
			} catch (SubstractionException e) {
				
				System.out.println("Please provide valid numbers : "+e);
			}
		}
	}
	
	public static void multiplication(int n1, int n2) {
		if(n1 > 0 && n2 > 0) {
			System.out.println("Multiplication is "+ (n1*n2));
		}else {
			try {
				throw new MultiplicationException("Both numbers should be greater than 0");
			} catch (MultiplicationException e) {
				System.out.println("Please provide valid numbers : "+e);
			}
		}
	}
	
	public static void division(int n1, int n2) {
		if(n2!= 0) {
			System.out.println("Division is "+ (n1/n2));
		}else {
			try {
				throw new DivisionException("Denominator should be greater than zero");
			} catch (DivisionException e) {
				System.out.println("Please provide valid numbers : "+e);
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = input.nextInt();
		System.out.println("Enter second number");
		int num2 = input.nextInt();
		
		addition(num1, num2);
		substraction(num1, num2);
		multiplication(num1,num2);
		division(num1, num2);

	}

}
