package com.oop.cloning;

public class DeepStudentGetSetTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		
	
	DeepAddressGetSet add = new   DeepAddressGetSet();
	add.setCity("Indore");
	
	DeepStudentGetSet st = new DeepStudentGetSet();
	st.setRollNo(202);
	st.setAdd(add);
	
	DeepStudentGetSet st2 = (DeepStudentGetSet) st.clone();
	st2.setRollNo(1000);
    st2.add.city = "bhopal";
    
    
    System.out.println(st.getRollNo());
    System.out.println(st.getAdd().city);
    
    
    System.out.println(st2.getRollNo());
    System.out.println(st2.getAdd().city);
	
	
	
	}
}
