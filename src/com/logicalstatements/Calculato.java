package com.logicalstatements;

import java.util.Scanner;

public class Calculato {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String yn = "";
		do {

			System.out.println("Enter a number : ");
			int a = sc.nextInt();
			System.out.println("Enter b number:");
			int b = sc.nextInt();
			System.out.println("Enter the experience like + - * / %");
			char sy = sc.next().charAt(0);
			int result = 0;
			
			switch (sy) {
			case '+' -> result = a + b;
			case '-' -> result = a - b;
			case '*' -> result = a * b;
			case '/' -> result = a / b;
			case '%' -> result = a % b;
			default -> System.out.println("Incorrect symbol");
			}

			System.out.println("Do you want to continue enter y if yes or n to no");
			yn = sc.next();
		} while (yn.equalsIgnoreCase("y"));

		System.out.println("calculator closed");
	}

}
