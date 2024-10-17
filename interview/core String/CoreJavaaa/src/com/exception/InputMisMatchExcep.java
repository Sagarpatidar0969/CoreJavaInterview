package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMisMatchExcep {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Please enter an integer:");

	        try {
	            // Expecting an integer input
	            int number = scanner.nextInt();  
	            System.out.println("You entered: " + number);
	        } catch (InputMismatchException e) {
	            System.out.println("InputMismatchException caught! You must enter an integer.");
	            e.printStackTrace();
	        }
	        
	        scanner.close();
	    }
	


}
