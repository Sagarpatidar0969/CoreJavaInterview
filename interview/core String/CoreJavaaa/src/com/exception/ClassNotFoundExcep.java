package com.exception;

public class ClassNotFoundExcep {
    public static void main(String[] args) {
        try {
            // Trying to load a class that does not exist
            Class.forName("com.rays.exception.BankTest");
            System.out.println("true");
        } catch (ClassNotFoundException e) {
        	System.out.println(e);
            System.out.println("ClassNotFoundException caught!");
            e.printStackTrace();
        }
    }
}

