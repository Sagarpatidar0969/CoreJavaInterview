package com.oop.cloning;


public class DeepStudentGetSet implements Cloneable {
	
	public int rollNo;
	public DeepAddressGetSet add;
	
	
	

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public DeepAddressGetSet getAdd() {
		return add;
	}

	public void setAdd(DeepAddressGetSet add) {
		this.add = add;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		DeepStudentGetSet student =    (DeepStudentGetSet)super.clone();
		student.add =  (DeepAddressGetSet)add.clone();
		
		
		return student;
	}
}
