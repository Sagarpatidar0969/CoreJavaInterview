package com.oop.immutable;

public final class ImmutableClass {
	
	private final int no;
	
	public ImmutableClass(int no) {
		this.no = no;
	}
	
	public int getNo() {
		return no;
	}
	
	public static void main(String[] args) {
		ImmutableClass c = new ImmutableClass(2);
		
		System.out.println(c.getNo());
			}
	

}
