package com.thread;

public class JoinThreadTest {
	public static void main(String[] args) {
		JoinThread t1 = new JoinThread("sagar");
		JoinThread t2 = new JoinThread("dilip");
		//JoinThread t3 = new JoinThread("neeraj");
		
		t1.start();
		
		try {
			t1.join();//wait for t1 to complete
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		t2.start();//start t2 after t1 is complete
	}

}
