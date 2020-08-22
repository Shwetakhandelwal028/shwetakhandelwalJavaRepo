package com.shweta.session8exercise.DataStructure;

public class StudentNode {
	
	private Student student;
	private StudentNode next;
	
	public Student getStudent() {
		return student;
	}
	
	public void setStudent(Student student) {
		this.student = student;
	}
	public StudentNode getNext() {
		return next;
	}
	public void setNext(StudentNode next) {
		this.next = next;
	}
	
	public StudentNode(Student student) {
		super();
		this.student = student;
	}

	@Override
	public String toString() {
		return student.toString();
	}
	
	
	
	

}
