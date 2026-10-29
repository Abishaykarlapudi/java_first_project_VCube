package com.languagefundamentals;

import java.util.Scanner;

public class Employee {
	
	{
		empid++;
	}

	static Scanner sc = new Scanner(System.in);

	static int empid;
	String eName;
	int salary;

	void readdeatils() {
		eName = sc.next();
		salary = sc.nextInt();
	}

	void display() {
		System.out.println(empid);
		System.out.println(eName);
		System.out.println(salary);
	}

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.readdeatils();
		e1.display();
		
		
		Employee e2 = new Employee();
		e2.readdeatils();
		e2.display();

		
		Employee e3 = new Employee();		
		e3.readdeatils();
		e3.display();
	}
}
