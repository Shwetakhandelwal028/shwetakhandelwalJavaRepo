package com.shweta.session5exercise.multithreading;

class Employee1 implements Runnable {

	int emp1Id = 1;

	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("Employee 1 id is : " + emp1Id);
			emp1Id++;
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class Employee2 implements Runnable {

	int emp2Id = 31;

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Employee 2 id is : " + emp2Id);
			emp2Id++;
			

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}
	}
}

public class EmployeeThreads {

	public static void main(String[] args) {
		
		Runnable emp1 = new Employee1();
		Runnable emp2 = new Employee2();
		
		Thread t1 = new Thread(emp1);
		Thread t2 = new Thread(emp2);
		
		t1.start();
		try { Thread.sleep(20); } catch (InterruptedException e) {}
		t2.start();
		

	}

}
