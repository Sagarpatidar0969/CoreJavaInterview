package com.oop.constructorcalling;

public class ConstructorOverloadings {
	
	private int num;
	private String name;
	private String add;
	
	public ConstructorOverloadings() {
		System.out.println("default");
	}
	public ConstructorOverloadings(int num) {
		this.num = num;
		System.out.println(num);
	}
	public ConstructorOverloadings(int num,String name) {
		this.num = num;
		this.name = name;
		System.out.println(num);
		System.out.println(name);
	}
	public ConstructorOverloadings(String name,String add) {
		this.name = name;
		this.add = add;
		System.out.println(name);
		System.out.println(add);
	}
	
	
	public static void main(String[] args) {
		ConstructorOverloadings c = new ConstructorOverloadings();
		ConstructorOverloadings c1 = new ConstructorOverloadings(1);
		ConstructorOverloadings c2 = new ConstructorOverloadings(2, "sr");
		ConstructorOverloadings c3 = new ConstructorOverloadings("sr", "indore");
	}
	
	
	

}
