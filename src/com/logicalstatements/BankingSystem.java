	package com.logicalstatements;
	
	import java.util.Scanner;
	
	import com.mysql.cj.xdevapi.Schema.CreateCollectionOptions;
	
	public class BankingSystem {
		static Scanner sc = new Scanner(System.in);
	
		private static double balance=500;
		private static boolean accountCreated = false;
		private static int accountNumber;
		private static String customerName;
		private static int age;
		private static String accountType;
		private static long mobileNumber;
		
		private static int nextAccountNumber = 1001;
	
		public static void main(String args[]) {
			int choice =0;
			Boolean continueBanking =true;
			do {
				System.out.println("Selete any one opestion \n 1.Create account \n 2.Deposit \n 3.Withdraw \n 4.Balance");
				choice = sc.nextInt();
				
				switch(choice) {
				case 1 -> createAccount();
				case 2 -> deposit();
				case 3 -> withdraw();
				case 4 -> displayBalance();
				default -> System.out.println("Invalid selection");
				}
				
				System.out.println("Do you want to continue? true/false");
			    continueBanking = sc.nextBoolean();
	
				
			}while(continueBanking);
		}
	
		
		
		private static  void createAccount() {
			sc.nextLine();
			System.out.print("Enter your full Name : ");
			customerName = sc.nextLine();
			System.out.print("Enter your age : ");
			age = sc.nextInt();
			System.out.print("Account type : \n 1.current account \n 2.savings accoutn");
			int type = sc.nextInt();
	
			if (type == 1) {
			    accountType = "Current";
			} else if (type == 2) {
			    accountType = "Savings";
			} else {
			    System.out.println("Invalid account type");
			    return;
			}
			System.out.print("Enter your mobile number : ");
			mobileNumber = sc.nextLong();
		}
	
		
		
		private static void withdraw() {
			System.out.println("Enter the amount you want to withdraw");
			double withdrawAmount = sc.nextDouble();
			if (withdrawAmount < 100) {
				System.out.println("You can't withdraw ammount less than 100");
			} else if (withdrawAmount > balance) {
				System.out.println("Insufficent balance");
			} else {
				balance -= withdrawAmount;
				System.out.println("Do you want to show your remaning balance");
				Boolean showBalance = sc.nextBoolean();
				if (showBalance) {
					System.out.println("After withdraw");
					displayBalance();
				}
			}
		}
	
		
		
		private static void displayBalance() {
			System.out.println("Your current balance is : " + balance);
		}
	
		
		
		private static  void deposit() {
			System.out.println("Enter the deposit amount : ");
			Double depositAmount = sc.nextDouble();
			if (depositAmount < 100) {
				System.out.println("deposit amount is less than 100");
			} else {
				balance += depositAmount;
				System.out.println("Do you want to show the current balance");
				Boolean showBalance = sc.nextBoolean();
				if (showBalance) {
					System.out.println("After deposit");
					displayBalance();
				}
	
			}
		}
	
	}
