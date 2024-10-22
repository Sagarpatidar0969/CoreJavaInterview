package com.thread;

public class PriorityThreadTest {
	public static void main(String[] args) {
		
		PriorityThread t1 = new PriorityThread("sagar");
		PriorityThread t2 = new PriorityThread("dilip");
		
		t1.setPriority(10);
		t2.setPriority(2);
		
		t1.start();
		t2.start();
				
				
	}

}
