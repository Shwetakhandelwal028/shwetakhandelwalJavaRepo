package com.shweta.session6exercise.exceptionhandling;

public class LoginThrowException {
	
	public static void login(int age) throws Exception {
		if(age > 18) {
			System.out.println("Allow access");
		}else
		{
			throw new Exception("Age should be greater than 18");
			
		}
	}

	public static void main(String[] args) {
		
		try {
			login(18);
		} catch (Exception e) {
			
			System.out.println("Exception Handling : "+e.getMessage());
		}
		
		

	}

}
