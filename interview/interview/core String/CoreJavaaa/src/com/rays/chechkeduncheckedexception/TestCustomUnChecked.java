package com.rays.chechkeduncheckedexception;

public class TestCustomUnChecked {
	public static void main(String[] args) {
		try {
			dad();
		}catch(CustomUncheckedEx e) {
			System.out.println(e.getMessage());
		}
	}
		public static void dad() {
			mom();
		 
	}
		public static void mom() {
			son();
		}
		public static void son() {
			CustomUncheckedEx e = new CustomUncheckedEx("unchecked");
			throw e;
		}

}
