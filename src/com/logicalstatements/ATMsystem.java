package com.logicalstatements;

import java.util.Scanner;

public class ATMsystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int correctPin = 1234;
        int balance = 10000;

        System.out.print("Enter your PIN: ");
        int pin = sc.nextInt();

        if (pin == correctPin) {

            System.out.print("Enter withdrawal amount: ");
            int amount = sc.nextInt();

            if (amount > 0) {

                if (amount <= balance) {

                    if (amount <= 5000) {
                        balance = balance - amount;
                        System.out.println("Withdrawal successful");
                        System.out.println("Remaining balance: " + balance);
                    } else {
                        System.out.println("Daily withdrawal limit exceeded");
                    }

                } else {
                    System.out.println("Insufficient balance");
                }

            } else {
                System.out.println("Invalid withdrawal amount");
            }

        } else {
            System.out.println("Incorrect PIN");
        }

        sc.close();
	}

}
