package com.shweta.session2exercise.accessmodifier;

public class Employee {

	private int empId;
	public String empName;
	protected double empSalary;	
	
	public int getID(int empId) {
		
		this.empId = empId;
		return empId;
	}
	
	public String getEmpName(String empName)
	{
		this.empName = empName;
		return  empName;
	}
	
	protected void showSalary(double empSalary)
	{
		this.empSalary = empSalary;
		System.out.println("Employee salary is :" +  empSalary);
	}
	
	
}
