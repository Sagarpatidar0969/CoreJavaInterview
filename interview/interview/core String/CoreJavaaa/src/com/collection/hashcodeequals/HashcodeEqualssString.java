package com.collection.hashcodeequals;

public class HashcodeEqualssString {
	
	public String name;
	public int id;
	public int salary;
	
	public HashcodeEqualssString(int id ,String name,int slary) {
		this.id= id;
		this.name= name;
		this.salary = salary;
	}
	
	@Override
	public int hashCode() {
		String str = this.id+this.name+this.salary;
		return str.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj ==null) {
			return false;
		}
		if(!(obj instanceof HashcodeEqualssString)) {
			return false;
		}
		HashcodeEqualssString a = (HashcodeEqualssString) obj;
		String s1 = this.id+this.name+this.salary;
		String s2 = a.id+a.name+a.salary;
		return s1.equals(s2);
	}
	@Override
	public String toString() {
		String str = id + " " + name + " " + salary;
		return str;
		
	}
	

}
