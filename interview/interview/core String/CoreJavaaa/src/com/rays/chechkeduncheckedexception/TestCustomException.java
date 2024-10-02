package com.rays.chechkeduncheckedexception;

public class TestCustomException {
	public static void main(String[] args) {
		
		try {
			dad();
		}catch(CustomCheckedException e ) {
			System.out.println(e.getMessage());
		}
	}
	public static void dad() throws CustomCheckedException{
		mom();
	}
	public static void mom()throws CustomCheckedException{
		son();
		
	}
	public static void son() throws CustomCheckedException{
		CustomCheckedException c = new CustomCheckedException();
		throw c;
	}

}
