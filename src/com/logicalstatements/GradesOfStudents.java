package com.logicalstatements;

import java.util.Scanner;

public class GradesOfStudents {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks");
		Double markes = sc.nextDouble();

		if (markes < 0 || markes > 100) {
			System.out.println("Invalid marks");
		} else if (markes >= 90) {
			System.out.println("Grade A");
		} else if (markes >= 80) {
			System.out.println("Grade B");
		} else if (markes >= 70) {
			System.out.println("Grade C");
		} else if (markes >= 60) {
			System.out.println("Grade D");
		} else if (markes >= 50) {
			System.out.println("Grade E");
		} else if (markes >= 40) {
			System.out.println("Passed  ");
		} else {
			System.out.println("Failed  ");
		}

	}

}
