package com.thread;

public class IsAliveMethod extends Thread {
    
    // The run() method contains the code that the thread will execute when started
    public void run() {
        System.out.println("method is alive");
    }
    
    public static void main(String[] args) {
        // Creating two instances of the IsAliveMethod thread class
        IsAliveMethod t1 = new IsAliveMethod();
        IsAliveMethod t2 = new IsAliveMethod();
        
        // Checking if t1 thread is alive before starting it (should return false)
        System.out.println(t1.isAlive()+"  "+"fff");
        
        // Starting the t1 thread, which calls the run() method
        t1.start();
        
        // Checking if t1 thread is alive after starting it (should return true)
        System.out.println(t1.isAlive() +"  "+"yyyyyyyyyyyyyyyyyyyyy");
        
        // Checking if t2 thread is alive before starting it (should return false)
        System.out.println(t2.isAlive()+"  "+"ffffffffffffffffffffff");
        
        // Starting the t2 thread, which calls the run() method
        t2.start();
       
        // Checking if t2 thread is alive after starting it (should return true)
        System.out.println(t2.isAlive()+"  "+"yyyyyyyyyyyyyyyyyyyyy");
    }
}
