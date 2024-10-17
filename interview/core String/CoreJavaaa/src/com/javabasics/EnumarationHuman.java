package com.javabasics;

public enum EnumarationHuman {
	
	KID(10),MAN(50);
	public final int weight;
	
	EnumarationHuman(int weight){
		this.weight =weight;
	}
	public void display() {
		System.out.println(weight);
	}
	
	
	
	public static void main(String[] args) {
		
		EnumarationHuman h = EnumarationHuman.KID;
		h.display();
		
	}
    
}

