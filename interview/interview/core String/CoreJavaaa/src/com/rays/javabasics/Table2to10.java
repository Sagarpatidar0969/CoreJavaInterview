package com.rays.javabasics;

public class Table2to10 {
	public static void main(String[] args) {
		int[][] t = new int[10][10];
		
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j <t.length-1; j++) {
			 t[i][j] =	(i+1)*(j+2);
			System.out.print(t[i][j]+" \t");
			}
			System.out.println(" ");
		}
	}

}
