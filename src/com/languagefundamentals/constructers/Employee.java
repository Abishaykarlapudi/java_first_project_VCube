package com.languagefundamentals.constructers;

public class Employee {

	int id;
	String name;
	double salary;
	
	
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}



	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Employee e1 = new Employee(1,"abishay",80000);
	}

}
