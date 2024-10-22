package com.thread;

public class RacingTest {

	public static void main(String[] args) {
		Racing t1 = new Racing("sagar");
		Racing t2 = new Racing("Dilip");
				t1.start();
				t2.start();
	}
}
