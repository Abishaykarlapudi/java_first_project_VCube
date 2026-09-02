package com.javaintro;

import java.util.Scanner;

// class
public class Student2 {

//	Variables
//	static variable college_Name
	static String college_Name = "Vcube";

//	instance variable
	int id;
	String name;
	int marks;

	static Scanner sc = new Scanner(System.in);

	void readDetails() {
		System.out.print("Enter student id:");
		id = sc.nextInt();
		System.out.print("Enter student name:");
		name = sc.next();
		System.out.print("Enter " + name + " marks:");
		marks = sc.nextInt();
		System.out.println("\n");

	}

	void displayDetails() {
		System.out.println("The student id:" + id);
		System.out.println("The student name:" + name);
		System.out.println("The " + name + " marks:" + marks);
		System.out.println("\n");
	}

//	main method
	public static void main(String[] args) {

//		object creation
//		s1 object reference
		Student2 s1 = new Student2();
		Student2 s3 = new Student2();
		Student2 s2 = new Student2();
		Student2 s4 = new Student2();
		Student2 s5 = new Student2();
		Student2.college_Name = "scube";
		s1.id = 101;
		s1.marks = 100;
		s1.name = "Abishay";

//		another object reference
		s2.id = 102;
		s2.marks = 100;
		s2.name = "Nagaraju";

		Student2.college_Name = "acube";
		s3.id = 103;
		s3.name = "shiva";
		s3.marks = 100;

		System.out.println(Student2.college_Name);
		System.out.println("Student id:" + s1.id);
		System.out.println("Student id:" + s1.marks);
		System.out.println("Student id:" + s1.name);

		System.out.println("Student id:" + s2.id);
		System.out.println("Student :" + s2.marks);
		System.out.println("Student name:" + s2.name);

		System.out.println(Student2.college_Name);
		System.out.println("Student id:" + s3.id);
		System.out.println("Student Marks:" + s3.marks);
		System.out.println("Student name:" + s3.name);

		s4.readDetails();
		s5.readDetails();

		s4.displayDetails();
		s5.displayDetails();
	}

}
