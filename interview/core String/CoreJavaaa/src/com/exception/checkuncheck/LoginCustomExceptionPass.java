package com.exception.checkuncheck;

public class LoginCustomExceptionPass {
	public static void main(String[] args) {
		String pass = "sagar@123";
		
		try {
			if(pass.equals("sagar@1243")) {
				System.out.println("user authentic");
			}else {
				LoginCustomException e = new LoginCustomException("invalid password");
				throw e;
			}
		}catch(LoginCustomException e) {
				System.out.println(e);
			}
		}
	}


