package com.exception;

public class ClassCastExce {
    public static void main(String[] args) {
        Object str = "This is a string";

        try {
            // Trying to cast a String object to an Integer, which is not allowed
            Integer number = (Integer) str;  // This will cause ClassCastException
        } catch (ClassCastException e) {
            System.out.println("ClassCastException caught!");
            e.printStackTrace();
        }
    }



}
