package com.javaintro;

import java.util.Scanner;

public class BankAccount {
	
	int accno;
	String holderName;
	float balance;
	static int accnoGenerater=20260000;
	
	{
		BankAccount.accnoGenerater++;
	}
	
	Scanner sc = new Scanner(System.in);
	
	void readDeatils() {
		accno=BankAccount.accnoGenerater;
		System.out.print("Enter the user Name:");
		holderName=sc.next();
		System.out.print("Enter the user Balance:");
		balance=sc.nextFloat();
		System.out.println("\n");
	}
	
	void display() {
		System.out.println("Account numer:"+accno);
		System.out.println("Account numer:"+holderName);
		System.out.println("Account numer:"+balance+"\n");
	}
	
	public static void main(String[] args) {
		BankAccount u1= new BankAccount();
		u1.readDeatils();
		
		BankAccount u2= new BankAccount();
		u2.readDeatils();
		
		BankAccount u3= new BankAccount();
		u3.readDeatils();
		
		u1.display();
		u2.display();
		u3.display();
		
	}

}
