package com.logicalstatements.loop;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		int rev=reverse(n);
		System.out.println("The reverse of the number :" + rev);
	}

	private static int reverse(int n) {
		
		int r=0;
		int rev=0;
		
		while(n!=0) {
			r=n%10;
			n/=10;
			rev=rev*10+r;
		}
		
		return rev;
	}

}
