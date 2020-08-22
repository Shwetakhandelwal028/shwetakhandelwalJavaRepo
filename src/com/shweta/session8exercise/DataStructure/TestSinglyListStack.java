package com.shweta.session8exercise.DataStructure;

public class TestSinglyListStack {

	public static void main(String[] args) {
	
		 Student s1 = new Student(101, "James", 75.8f);
		 Student s2 = new Student(102, "John", 65.8f);
		 Student s3 = new Student(103, "Mike", 79.0f);
		 Student s4 = new Student(104, "Mary", 89.8f);
		 Student s5 = new Student(105, "Stella", 90.8f);
		 
		 StudentSinglyListStack stack = new StudentSinglyListStack();
		 System.out.println("The Stack size : "+ stack.getSize());
		 stack.push(s5);
		 stack.push(s4);
		 stack.push(s3);
		 stack.push(s2);
		 stack.push(s1);
		 
		 stack.displayList();
		 System.out.println("***************************************************");
		 
		 System.out.println("The Stack size : "+ stack.getSize());
		 System.out.println("top -> "+ stack.peek());
		 
		 stack.pop();
         System.out.println("***************************************************");
		 
		 System.out.println("The Stack size : "+ stack.getSize());
		 System.out.println("top -> "+ stack.peek());
		 
		 
		 

	}

}
