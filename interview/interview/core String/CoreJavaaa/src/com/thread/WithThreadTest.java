package com.thread;

public class WithThreadTest {

	public static void main(String[] args) {
		WithThread t1 = new WithThread("sagar");
		WithThread t2 = new WithThread("dilip");
		
		t1.start();
		t2.start();
	}
	
}
