package com.shweta.session8exercise.DataStructure;

public class StudentSinglyListStack {

	
    private StudentNode top;
    private int size;
	
	StudentSinglyListStack(){
		this.top = null;
	}
	
	public void push(Student student) {
		
		StudentNode temp = new StudentNode(student);
		
		temp.setStudent(student);
		temp.setNext(top);
		top = temp;
		size++;
		
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	
	public Student peek() {
		if(!isEmpty()) 
			return top.getStudent();
		else
			System.out.println("Stack is empty");
		    return null;
		
	}
	
	public void pop() {
		if(top == null)
			System.out.println("Stack Underflow");
		
		else
			
			top = top.getNext();
		    size--;
		    
	}
	
	public int getSize() {
		return size;
	}
	
	public void displayList() {
		if (top == null) { 
            System.out.printf("\nStack Underflow"); 
		}else {
			StudentNode temp = top;
			System.out.println("top->");
			while(temp!= null) {
				System.out.print(temp);
				System.out.print("->");
				temp = temp.getNext();
			}
			System.out.println("null");
			
		}
	}
	
	
	
	
}
