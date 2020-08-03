package com.shweta.session3exercise.collection;

import java.util.ArrayList;
import java.util.List;

public class TestStudentList {

	public static void main(String[] args) {
		
		Student s1 = new Student(101, "John", "Smith", 59.6, "Bangalore" );
		Student s2 = new Student(102, "Mike", "Smith", 90.0, "Pune" );
		Student s3 = new Student(103, "Jaye", "Robin", 77.9, "Hyderabad" );
		Student s4 = new Student(104, "Karl", "Chin", 80.5, "Chennai" );
		
		List<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		System.out.println("Student details are :");
		System.out.println("------------------------------------------------");
		
		for(Student student : list) {
			
			
			System.out.println("ID "+ student.getId() + ", FirstName "
			+student.getFirstName()+ ", LastName "+student.getLastName()+
			", Marks "+student.getMarks()+ ", Address "+student.getAddress());
			
			System.out.println("------------------------------------------------");
			
		}
	}

}
