package com.oop.cloning;

public class ShallowCloneeTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		ShallowClonee s = new ShallowClonee();
		s.rollNo=101;
		
		ShallowClonee s2 = (ShallowClonee)  s.clone();
		
		s2.rollNo = 500;
		
		System.out.println(s.rollNo);
		System.out.println(s2.rollNo);
	}

}
