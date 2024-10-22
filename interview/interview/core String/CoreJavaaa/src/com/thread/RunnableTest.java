package com.thread;

public class RunnableTest implements Runnable{

	public String name;
	
	public RunnableTest(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for (int i = 1; i <=2; i++) {
			System.out.println(i + " " + name);
		}
	}
	public static void main(String[] args) {
		Thread t1 = new Thread(new RunnableTest("ram"));
		Thread t2 = new Thread(new RunnableTest("sagar"));
		
		t1.start();
		t2.start();
	}
		
	
}
