package com.languagefundamentals.constructers;

public class BankAccount {

	static int accountNumber=1234;
	String customername;
	String accounttype;
	double balance;
	
	{
		accountNumber++;
	}
	BankAccount(){
		System.out.println("constructer");
	}
	
	BankAccount(String customername,String accounttype,double balance){
		this.customername=customername;
		this.accounttype=accounttype;
		this.balance=balance;
	}
	
	void display() {
		System.out.println("Bank Account Number is :"+accountNumber);
		System.out.println("Customer Name is :"+customername);
		System.out.println("Bank Account Type is :"+accounttype);
		System.out.println("Bank Account balance is :"+balance);
	}
	
	public static void main(String[] args) {
		BankAccount b3=new BankAccount();
		BankAccount b1=new BankAccount("abhi","savings",10000);
		b1.display();
		System.out.println();
		
		
		BankAccount b2=new BankAccount("ravi","fixed",10000);
		b2.display();
	}

}
