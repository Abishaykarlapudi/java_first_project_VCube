package com.logicalstatements.loop;

import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for the table:");
		int n = sc.nextInt();
		System.out.println("Enter the length of the table:");
		int n1 = sc.nextInt();
		for(int i=1;i<=n1;i++) {
			System.out.println(n + " X " + i + " = " + n*i);
		}
	}

}
