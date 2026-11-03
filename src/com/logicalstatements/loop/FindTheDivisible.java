package com.logicalstatements.loop;

import java.util.Scanner;

public class FindTheDivisible {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n =sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			if(i%15==0) {
				System.out.println("Buzz & Fizz");
			}else if(i%3==0) {
				System.out.println("Buzz");
			}else if(i%5==0) {
				System.out.println("Fizz");
			}
		}
		
	}

}
