package com.javabasics;

public class NoteCount {
	public static void main(String[] args) {
		int[] a = {2000,500,200,100,50,20,10,5};
		
		int amt = 6660;
		int n =0;
		
		
		
		for (int i = 0; i < a.length; i++) {
			
			
			
			n=amt/a[i];
		
			if(n>0) {
				System.out.println(n + ":" + a[i]);
			}
			
			
			
			amt = amt%a[i];
			
			}
		
		}
	}


