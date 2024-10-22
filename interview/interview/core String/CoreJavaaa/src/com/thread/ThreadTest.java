package com.thread;

public class ThreadTest extends Thread {

	private String name;

	public ThreadTest(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {

			System.out.println(i + " " + name);

		}
	}

	public static void main(String[] args) {

		ThreadTest t1 = new ThreadTest("sagar");
		ThreadTest t2 = new ThreadTest("ram");

		t1.start();
		t2.start();

	}

}