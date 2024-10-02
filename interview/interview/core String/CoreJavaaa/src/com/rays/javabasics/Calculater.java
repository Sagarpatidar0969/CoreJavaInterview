package com.rays.javabasics;
import java.util.Scanner;

public class Calculater {
    public static void main(String[] args) {
      
    	
        Scanner sc = new Scanner(System.in);
        
        //System.out.println("enter first");
        int a=10;
       // System.out.println("enter second");
        int b=20;
      
        System.out.println("Enter");
        char  op = sc.next().charAt(0);
      
        
        
        switch (op) {
            case '+':
            {
                System.out.println("Addition result: " +  (a + b));
                break;
            }
            case '-':
                
                System.out.println("Subtraction result: " + (a - b));
                break;
            case '*':
                 
                System.out.println("Multiplication result: " + a * b);
                break;
            
             default :
            	 System.out.println("not");
            	 break;
                
        }
       

        sc.close();
    }
}
