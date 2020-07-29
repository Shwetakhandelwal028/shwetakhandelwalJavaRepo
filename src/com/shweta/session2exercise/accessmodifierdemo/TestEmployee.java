package com.shweta.session2exercise.accessmodifierdemo;

import com.shweta.session2exercise.accessmodifier.Employee;

public class TestEmployee extends Employee {

	public static void main(String[] args) {
		TestEmployee emp1 = new TestEmployee();
		int emp1Id = emp1.getID(101);
		String emp1Name = emp1.getEmpName("John");
		
		System.out.println("Employee details are:");
		emp1.showSalary(10000.0);
		System.out.println("Employee ID is : " + emp1Id + " Employee Name is : " + 
		emp1Name);

	}

}
