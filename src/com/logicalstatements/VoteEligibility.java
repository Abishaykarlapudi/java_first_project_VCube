package com.logicalstatements;

import java.util.Scanner;

public class VoteEligibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age: ");
		Integer age = sc.nextInt();

		if (age < 0 || age > 150) {
			System.out.println("Invalid age, enter an valid age");
		} else if (age < 18) {
			System.out.println("your are not eligible for the voting");
		} else {
			sc.nextLine();
			System.out.print("Enter your citizenship : ");
			String citizenship = sc.nextLine();
			if (citizenship.toUpperCase().equals("INDIA")  || citizenship.toUpperCase().equals("INDIAN")) {
				System.out.print("Did you have voterId  : ");
				Boolean hasVoterId = sc.nextBoolean();
				if (hasVoterId) {
					System.out.println("Your eligible for the voting !!");
				} else {
					System.out.println("Your not eligible for the voting !!");
				}
			} else {
				System.out.println("your are not eligible for the voting");
			}
		}
	}

}
