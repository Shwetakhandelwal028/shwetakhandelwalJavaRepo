package com.shweta.session6exercise.exceptionhandling;

public class DivisionException extends Exception{

	String message;
	
	DivisionException(String message){
		this.message = message;
		
	}
	
	public String toString() {
		return "Division Exception occurred, "+ message;
	}
}
