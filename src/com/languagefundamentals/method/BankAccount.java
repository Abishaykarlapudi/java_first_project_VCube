package com.languagefundamentals.method;

import java.util.Scanner;

public class BankAccount {

	static Scanner sc = new Scanner(System.in);

	static int balance = 1000;

	public static void main(String[] args) {
		System.out.println("main method started");
		int amount = 0;
		System.out.print("Eneter the you want to deposit:");
		amount = sc.nextInt();
		deposit(amount);
		System.out.print("Eneter the you want to withdraw:");
		amount = sc.nextInt();
		withdraw(amount);

		System.out.println("main method ended");
	}

	static void deposit(int amount) {
		balance += amount;
		System.out.println("the amount you have after deposit:"+balance);
	}

	static void withdraw(int amount) {
		if (amount < balance) {
			balance -= amount;
			System.out.println("after withdraw the balance is :");
		} else {
			System.out.println("you don't have that much balance");
		}
	}
}