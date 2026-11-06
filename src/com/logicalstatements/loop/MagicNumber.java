package com.logicalstatements.loop;

import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();

		boolean flag = isMagicNumber(n);
		if (flag) {
			System.out.println("The given number is magic number");
		} else {
			System.out.println("The given number is magic number");
		}

	}

	private static boolean isMagicNumber(int n) {

		boolean status = false;
		int sum = 0;
		int r = 0;

		if ((n >= 2 && n <= 9) || n <= 0) {
			return false;
		} else if (n == 1) {
			return true;
		} else {

			while (n > 0) {
				r = n % 10;
				n /= 10;
				sum += r;
				if (sum > 10 && n <= 0) {
					n = sum;
					sum = 0;
				}
			}
		}
		if (sum == 1) {
			status = true;
		}

		return status;
	}

}
