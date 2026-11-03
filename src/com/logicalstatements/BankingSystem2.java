package com.logicalstatements;

import java.util.Scanner;

public class BankingSystem2 {

	static Scanner sc = new Scanner(System.in);

	public static double balance = 500;

	public static void main(String[] args) {

		System.out.println("Wellcome to vcube banking :");
		String yn="";
		do {

			System.out.println("Enter the Account type:");
			System.out.println("  1.savings Account \n  2.current Account");
			int accountType = sc.nextInt();
			switch (accountType) {

			case 1 -> {
				
				do {
					System.out.println(" 1.Withdraw \n 2.Deposit \n 3.balance");
					System.out.print("choose any opetion:");
					int type = sc.nextInt();
					switch (type) {
					case 1 -> withdraw();

					case 2 -> deposit();

					case 3 -> showBalance();

					default -> System.out.println("Invalid opestion");

					}
					System.out.println("do you want do more transaction in this  savings account");
					yn = sc.next();
				} while (yn.equalsIgnoreCase("y"));
			}

			case 2 -> {
				
				do {
					System.out.println(" 1.Withdraw \n 2.Deposit \n 3.balance");
					System.out.print("choose any opetion:");
					int type = sc.nextInt();
					switch (type) {
					case 1 -> withdraw();

					case 2 -> deposit();

					case 3 -> showBalance();

					default -> System.out.println("Invalid opestion");

					}
					System.out.println("do you want do more transaction in this current account");
					yn = sc.next();
				} while (yn.equalsIgnoreCase("y"));
			}

			}

			System.out.println("do you want to continue");
			yn = sc.next();
			
		} while (yn.equalsIgnoreCase("y"));

	}

	private static void deposit() {
		System.out.println("Enter the amount you want to deposit");
		double depositAmount = sc.nextDouble();
		if (depositAmount < 100) {
			System.out.println("Entered amount is less than 100.. \nPlease enter the amount more than 100");
		} else {
			balance += depositAmount;
			System.out.println("Do you want to see the balance..");
			String sb = sc.next();
			if (sb.equalsIgnoreCase("y")) {
				System.out.println("After deposit..");
				showBalance();
			}
		}
	}

	private static void withdraw() {

		System.out.println("Enter the amount you want to withdraw");
		double withdrawAmount = sc.nextDouble();
		if (withdrawAmount < 100) {
			System.out.println("Entered amount is less than 100.. \nPlease enter the amount more than 100");
		} else if (withdrawAmount > balance) {
			System.out.println("Insaficent balance");
			System.out.println("Do you want to see the balance..");
			String sb = sc.next();
			if (sb.equalsIgnoreCase("y")) {
				showBalance();
			}
		} else {
			balance -= withdrawAmount;
			System.out.println("Do you want to see the balance..");
			String sb = sc.next();
			if (sb.equalsIgnoreCase("y")) {
				System.out.println("After withdraw..");
				showBalance();
			}
		}

	}

	private static void showBalance() {
		System.out.println("The balance you have in your account is :" + balance);
	}

}
