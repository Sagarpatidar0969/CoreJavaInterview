package com.streamapi;

public class StreamSalary2000 {
	String name;
	double salary;

	public StreamSalary2000(String name, double salary) {
		this.name = name;
		this.salary=salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "StreamSalary2000 [name=" + name + ", salary=" + salary + "]";
	}


}
