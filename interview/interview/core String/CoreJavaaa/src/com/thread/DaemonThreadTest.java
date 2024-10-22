package com.thread;

public class DaemonThreadTest {
	public static void main(String[] args) {
		
		BackgroundThread t1 = new BackgroundThread("sagar");
		
		t1.setDaemon(true);
		
		t1.start();
		
		for (int i = 1; i <=5; i++) {
			try {
				Thread.sleep(100);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i +"    " + "main");
		}
	}

}
