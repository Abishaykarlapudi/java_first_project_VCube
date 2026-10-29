package com.languagefundamentals.constructers;

public class BankAccount1 {

	int accountNumber;
	String accountHolderName;
	double balance;
	String branch;
	
	BankAccount1(int  accountNumber,String accountHolderName,double balance,String branch){
		this.accountHolderName=accountHolderName;
		this.accountNumber=accountNumber;
		this.balance=balance;
		this.branch=branch;
	}
	
	BankAccount1(BankAccount1 b){
		this.accountHolderName=b.accountHolderName;
		this.balance=b.balance;
		this.accountNumber=b.accountNumber;
		this.branch=b.branch;
	}
	
	void display() {
		System.out.println("********************************************************");
		System.out.println("The account number is       :"+accountNumber);
		System.out.println("The account holder number is:"+accountHolderName);
		System.out.println("The account balance is      :"+balance);
		System.out.println("The account branch is       :"+branch);
	}
	
	public static void main(String[] args) {
		BankAccount1 b1= new BankAccount1(1234,"abishay",29374927,"hyd");
		b1.display();
		BankAccount1 b2= new BankAccount1(b1);
		b2.display();
	}

}
