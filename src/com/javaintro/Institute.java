package com.javaintro;

import java.util.Scanner;

public class Institute {

	Scanner sc = new Scanner(System.in);

	static String trainerName1 = "srikanth";
	static String trainerName2 = "vishwanth";

	String EmployeeName;
	int employeeId;
	String Designation;

	static Institute s1 = new Institute();
	static Institute s2 = new Institute();
	static Institute s3 = new Institute();
	static Institute s4 = new Institute();
	static Institute s5 = new Institute();

	public void read() {
		System.out.print("Enter the Employee Name:");
		EmployeeName = sc.next();
		System.out.print("Enter the Employee Id:");
		employeeId = sc.nextInt();
		System.out.print("Enter the Employee Designation:");
		Designation = sc.next();
		System.out.println("\n");

	}

	void display() {
		System.out.println("Employee Id:" + employeeId);
		System.out.println("Employee Name:" + EmployeeName);
		System.out.println(EmployeeName + " Designation:" + Designation + "\n");
	}

	public static void main(String[] args) {

		s1.read();
		s2.read();
		s3.read();
		s4.read();
		s5.read();

		s1.display();
		s2.display();
		s3.display();
		s4.display();
		s5.display();
	}

}
