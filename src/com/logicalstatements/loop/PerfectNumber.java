package com.logicalstatements.loop;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		boolean flag = isPerfect(n);

		if (flag) {
			System.out.println("Given number is perfect number");
		} else {
			System.out.println("Given number is not a perfect number");
		}

	}

	private static boolean isPerfect(int n) {

		boolean status = false;
		int sum = 1;

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}

//		for (int i = 2; i <= Math.sqrt(n); i++) {
//
//            if (n % i == 0) {
//
//                sum += i;
//
//                if (i != n / i) {
//                    sum += n / i;
//                }
//            }
//
//            if (sum > n) {
//                return false;
//            }
//        }

		if (sum == n) {
			status = true;
		}

		return status;
	}

}
