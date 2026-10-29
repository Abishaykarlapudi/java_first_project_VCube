package com.languagefundamentals;

public class Account {
	
	int amount=100;
	int cost=7;
	public static void main(String args[]) {
		Account a=new Account();
		System.out.println(a.amount/a.cost);
		System.out.println(a.amount%a.cost);
	}
}
