package com.exception;

public class ArithmeticExcepti {

	public static void main(String[] args) {

		try {
			int c =  10/0;
			
			System.out.println(c);
		}catch(ArithmeticException e) {
			System.exit(0);
			e.printStackTrace();
			System.out.println(e);
		}finally {
			System.out.println("finaaly");
		}
		
		
	}
//	 public static void main(String[] args) {
//	        try {
//	        	int c =  10/0;
//	        	
//	            System.out.println("Inside try block");
//	            System.exit(0); // Program will terminate here
//	            System.out.println("This will not be printed");
//	        } catch (Exception e) {
//	            System.out.println("Inside catch block");
//	        } finally {
//	            System.out.println("Finally block"); // This won't be printed
//	        }
//	    }

}
