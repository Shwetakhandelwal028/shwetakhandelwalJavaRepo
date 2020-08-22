package com.shweta.session8exercise.DataStructure;

public class Student {
	
	private int rollNo;
	private String Name;
	private float marks;
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public Student(int rollNo, String name, float marks) {
		super();
		this.rollNo = rollNo;
		Name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", Name=" + Name + ", marks=" + marks + "]";
	}
	
	
	

}
