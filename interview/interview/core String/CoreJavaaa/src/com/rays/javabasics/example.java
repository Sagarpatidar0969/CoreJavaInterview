package com.rays.javabasics;
class Emp implements Cloneable{
	String name;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
class Sellry implements Cloneable{
	int selry;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
class Dep implements Cloneable{
	String dep;
	Emp e=new Emp();
	Sellry s=new Sellry();
	public Dep(String name,String dep,int selry) {
		// TODO Auto-generated constructor stub
		this.dep=dep;
		this.e.name=name;
		this.s.selry=selry;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Dep d=(Dep) super.clone();
		//d.e=(Emp)e.clone();
		d.s=(Sellry) s.clone();
		return d;
	}
}

public class example {
	public static void main(String[] args) throws CloneNotSupportedException {
		Dep d1=new Dep("Rahul", "it",1234);
		Dep d2=(Dep) d1.clone();
		d2.dep="hr";
		d2.e.name="sham";
		d2.s.selry=5678;
		System.out.println(d1.dep);
		System.out.println(d1.e.name);
		System.out.println(d1.s.selry);
		System.out.println(d2.dep);
		System.out.println(d2.e.name);
		System.out.println(d2.s.selry);
		
	}

}
