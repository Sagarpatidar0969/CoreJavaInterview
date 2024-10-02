package com.oop.cloning;

class DeepAddress implements Cloneable {

	public String city;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}

class DeepSalary implements Cloneable {
	public int Salary;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}

class DeepStudent implements Cloneable {

	public int rollNo;

	DeepAddress add = new DeepAddress();
	DeepSalary sal = new DeepSalary();

	public DeepStudent(int rollNo, String city, int Salary) {
		this.rollNo = rollNo;
		this.add.city = city;
		this.sal.Salary = Salary;
		
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		DeepStudent student = (DeepStudent) super.clone();
		student.add = (DeepAddress) add.clone();
		student.sal = (DeepSalary) sal.clone();

		return student;
	}
}

public class DeepcloningByConstructor {
	public static void main(String[] args) throws CloneNotSupportedException {

		DeepStudent s = new DeepStudent(1234, "indore", 122);
		// the type casting is necessary because the clone() method in Java's Object
		// class returns a reference of type Object.
		DeepStudent s1 = (DeepStudent) s.clone();
		s1.rollNo = 8889;
		s1.add.city = "bhopal";
		s1.sal.Salary = 6666;

		System.out.println(s.rollNo);
		System.out.println(s.add.city);
		System.out.println(s.sal.Salary);

		System.out.println("--------------------------------------------");

		System.out.println(s1.rollNo);
		System.out.println(s1.add.city);
		System.out.println(s1.sal.Salary);

		System.out.println("---------------------------------------------");

	}

}
