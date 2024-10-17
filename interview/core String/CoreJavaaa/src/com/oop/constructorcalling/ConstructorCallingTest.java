package com.oop.constructorcalling;

public class ConstructorCallingTest extends ConstructorCalling{
	public ConstructorCallingTest(String fName,String lName,String address) {
		super(fName,lName,address);
	}
	
	public static void main(String[] args) {
	
		ConstructorCallingTest c = new ConstructorCallingTest("sagar","patidar", "indore");
		
	}

}
