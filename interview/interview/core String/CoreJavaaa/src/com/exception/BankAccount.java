package com.exception;

public class BankAccount {
	
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposite(double amt) {
		balance = balance+amt;
		//System.out.println(balance);
	}
	public double withdraw(double amt)throws BankException{
		balance = balance-amt;
		
		if(balance<2000) {
			System.out.println(balance);
			BankException e = new BankException("amount is less than 2000");
			throw e;
		}
		return balance;
	}
	

}
