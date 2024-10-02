package com.oop.person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PersonByInterfaceTest implements PersonByInterface{

	@Override
	public String Aa(String name, int age, Date dates) {
		// TODO Auto-generated method stub
		return name+age+dates;
	}
	public static void main(String[] args) throws ParseException {
		PersonByInterfaceTest p = new PersonByInterfaceTest();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
		
		
		System.out.println(p.Aa(name, age, sdf.parse("12-12-2024")));
	}

}
