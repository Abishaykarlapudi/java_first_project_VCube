package com.logicalstatements.loop;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		
		boolean flag = isPerfect(n);
		
		if(flag) {
			System.out.println("Given number is perfect number");
		}else {
			System.out.println("Given number is not a perfect number");
		}
		
	}

	private static boolean isPerfect(int n) {
		
		boolean status = false;
		int sum=0;
		
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		
		if(sum==n) {
			status=true;
		}
		
		return status;
	}

}
