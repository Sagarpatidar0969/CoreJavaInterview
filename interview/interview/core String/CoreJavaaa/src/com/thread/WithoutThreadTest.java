package com.thread;

public class WithoutThreadTest {
	public static void main(String[] args) {
		
	
	WithoutThread t1 = new WithoutThread("sagar");
	WithoutThread t2 = new WithoutThread("dilip");
	
	t1.run();
	t2.run();
}
}