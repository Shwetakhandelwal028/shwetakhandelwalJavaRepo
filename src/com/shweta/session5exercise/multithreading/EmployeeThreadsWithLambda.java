package com.shweta.session5exercise.multithreading;

public class EmployeeThreadsWithLambda {

	public static void main(String[] args) {

		Thread t1 = new Thread(() -> {
			int emp1Id = 1;
			for (int i = 0; i < 10; i++) {
				System.out.println("Employee 1 id is : " + emp1Id);
				emp1Id++;
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}

			}
		});
		
		Thread t2 = new Thread(()-> {
			int emp2Id = 31;
			for (int i = 0; i < 10; i++) {
				System.out.println("Employee 2 id is : " + emp2Id);
				emp2Id++;
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}

			}
			
		});
		
		t1.start();
		try { Thread.sleep(20); } catch (InterruptedException e) {}
		t2.start();
	}
}
