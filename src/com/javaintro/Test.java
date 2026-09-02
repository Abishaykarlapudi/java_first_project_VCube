package com.javaintro;

import java.util.*;


// This is the class of students where we can store the details student
class Students {
	int id;
	String name;
	String course;
	int fees;
	public static int x;
	void display() {
		x=10;
		System.out.println("Student id:" + id);
		System.out.println("Student Name:" + name);
		System.out.println("Student Course:" + course);
		System.out.println("Student Fees:" + fees);
	}

}




// This is the main class were we call all the objects and the store the values of the students
public class Test {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Students s1 = new Students();
		System.out.print("Enter the student id:");
		s1.id = sc.nextInt();
		System.out.print("Enter the student name:");
		s1.name = sc.next();
		System.out.print("Enter the student course:");
		s1.course = sc.next();
		System.out.print("Enter the student fees:");
		s1.fees = sc.nextInt();
		s1.display();
		s1.x=20;
	}

}
