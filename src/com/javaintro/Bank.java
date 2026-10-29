package com.javaintro;

import java.util.Scanner;

public class Bank{
	
	
	
	
	static {
		System.out.println("Static block");
	}
	
	static int accnoGenerater=20260000;

	
	int accno;
	String holderName;
	float balance;
	String place="hyd";
	
	
	{
		Bank.accnoGenerater++;
	}
	
	static void display() {
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("main method called");
		BankAccount u1= new BankAccount();
//		instance block called 
		u1.accno=Bank.accnoGenerater;
		u1.holderName="xyz";
		u1.balance=10000;
		
		BankAccount u2= new BankAccount();
		u2.accno=Bank.accnoGenerater;
		u2.holderName="xyz";
		u2.balance=10000;
		
		
		
		BankAccount u3= new BankAccount();		
		u3.accno=Bank.accnoGenerater;
		u3.holderName="xyz";
		u3.balance=10000;
		
	}

}
