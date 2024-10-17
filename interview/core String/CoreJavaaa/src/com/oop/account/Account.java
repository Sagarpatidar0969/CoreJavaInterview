package com.oop.account;

public class Account {
	private double balance;
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Double getBalance() {
		return balance;
	}
	
	
	public double deposit(int amt) {
		balance = balance+amt;
		
		//System.out.println(balance + "after deposit");
		return balance;
	}
	public double withdrawal(int amt) {
		if (balance - amt >= 2000) {
			
		balance = balance - amt;
		//System.out.println(balance + "after withdrawal");
		return balance;
		
		}
		else {
			//System.out.println("balance low");
			return -1;
		}
		
	}
	
	public static void main(String[] args) {
		Account t = new Account();
		t.setBalance(2000);
		
		 double newDep =t.deposit(100);
		 System.out.println("dep" + " " + newDep);
		 
		   double newWith=t.withdrawal(300);
		  
		   if(newWith>=0) {
		   System.out.println("with" + " "  + newWith);
	}else {
		System.out.println("low balance");
	}
	}
}
