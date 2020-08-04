package com.shweta.session4exercise.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestEmployeeMap {
	
	public static void main(String []args) {
		
		Map<Integer, String> employee = new HashMap<Integer, String>();
		employee.put(1, "Mary");
		employee.put(2, "Jane");
		employee.put(3, "Rose");
		employee.put(4, "Joseph");
		employee.put(5, "George");
		employee.put(6, "Kim");
		employee.put(7, "Samuel");
		employee.put(8, "James");
		employee.put(9, "Kori");
		employee.put(10, "Karl");
		employee.put(11, "Simple");
		
		System.out.println("Enter the Employee Id that you want to search");
		Scanner input = new Scanner(System.in);
		
		int empId = input.nextInt();
		
		int count = 0;
		
		for(Map.Entry emp : employee.entrySet() ) {
			
			if(emp.getKey().equals(empId)) {
				System.out.println("Employee name is :"+ emp.getValue() 
						+ " 7whose id is " + emp.getKey());
				
				count = 1;
			}
		}
		
		if(count<=0) {
			System.out.println("Employee is not present");
		}
		
	}
}
