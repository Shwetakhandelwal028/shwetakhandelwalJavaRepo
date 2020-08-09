package com.shweta.session5exercise.multithreading;

 class  StringManipulationWithThreads {
	
	StringBuffer userName = new StringBuffer("James");
	
	public synchronized void StringManipulation(String str) {
		System.out.println("Old String is : "+ userName);
		userName.append(str);
		System.out.println("New String is : "+ userName);
	} 

}

public class ThreadSafetyDemo{
	
	public static void main(String []args) throws InterruptedException {
		StringManipulationWithThreads st = new StringManipulationWithThreads();
		
		Thread t1 = new Thread(() -> {
			st.StringManipulation("William");
		});
		
		Thread t2 = new Thread(() -> {
			st.StringManipulation("Betth");
		});
		
		Thread t3 = new Thread(() -> {
			st.StringManipulation("Rudy");
		});
		
		
		t1.start();
		try { Thread.sleep(500); } catch (InterruptedException e) {}
		t2.start();
		try { Thread.sleep(500); } catch (InterruptedException e) {}
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println("The final String is : "+ st.userName);
		
	}
}
