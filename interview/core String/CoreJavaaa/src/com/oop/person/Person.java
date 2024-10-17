package com.oop.person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
	private String name;
	private int age;
	private Date dates;
	private String address;
	
	public static final String CITY="indore";
	
	public void setName(String name) {
		this.name =name;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getDates() {
		return dates;
	}
	public void setDates(Date dates) {
		this.dates = dates;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public static void main(String[] args) throws ParseException {
		Person p = new Person();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		p.setName("sr");
		p.setAge(21);
		p.setAddress("RJ");
		p.setDates(sdf.parse("19-12-2023"));
		
		System.out.println(CITY);
		System.out.println(p.getName());
		System.out.println(p.getAddress());
		System.out.println(p.getAge());
		System.out.println(p.getDates());
		
	}
	
}
