package com.shweta.session6exercise.exceptionhandling;

public class SubstractionException extends Exception {

	String message;
	
	SubstractionException(String message){
		this.message = message;
	}
	
	public String toString() {
		return "Substraction Exception occurred, "+message;
	}
}
