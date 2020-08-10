package com.shweta.session6exercise.exceptionhandling;

public class MultiplicationException extends Exception{
  

	String message;
	
	MultiplicationException(String message){
		this.message = message;
	}
	
	public String toString() {
		return "Multiplication Exception occurred, "+message;
	}
}
