package com.shweta.session3exercise.arrays;

import java.util.Scanner;

public class FindEmployee {

	public static void main(String[] args) {
		
		String []empList = {"David", "Michael", "Mary", "John", "Mike", 
				"Jersey", "Rose", "Lily", "Sam", "Peter"};
		
		System.out.println("This is the Employee list");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the name of the Employee that you want to search");
        String inpEmp = input.nextLine();
        
        int count = 0;
        
        for(int i = 0; i<empList.length; i++) {
        	
        	if(empList[i].equals(inpEmp)) {
        		
        		System.out.println("Employee belongs to our Company and the name present at index " +
        				(i+1));
        		count = 1;
        	}
        }
        
        if(count<=0) {
        	System.out.println("Employee does not belongs to our Company");
        }
	}
}
