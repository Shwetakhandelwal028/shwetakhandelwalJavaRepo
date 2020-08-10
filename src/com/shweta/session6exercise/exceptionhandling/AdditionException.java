package com.shweta.session6exercise.exceptionhandling;

public class AdditionException extends Exception{

	String message;
	
	AdditionException(String message)
	{ this.message = message;}
	
	public String toString() {
		
		return "Addition Exception Occurred, "+message; 
	}
}
