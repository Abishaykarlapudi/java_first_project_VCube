package com.languagefundamentals.constructers;

public class Employee1 {

	int id;
	String name;
	double salary;
	
	Employee1(int id,String name,double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	void calculate() {
		salary=salary+(salary*0.1);
	}
	
	void display() {
		System.out.println();
		System.out.println("The employee id is :"+id);
		System.out.println("The employee name is :"+name);
		System.out.println("The employee salary is :"+salary);
	}
	
	public static void main(String[] args) {
		
		Employee1 e1 = new Employee1(1,"abishay",50000);
		e1.display();
		e1.calculate();
		e1.display();
		
	}

}
