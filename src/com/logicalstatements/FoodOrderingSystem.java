package com.logicalstatements;

import java.util.Scanner;


public class FoodOrderingSystem {

	static Scanner sc =new Scanner(System.in);
	static int tokenNo=0;
	
	public static void main(String[] args) {
		
		double bill =0;
		boolean yn=true;
		int quantity=0;
		System.out.println("Wellcome to vcbue restarent:");
		do {
		System.out.println("Menu ");
		System.out.println("Enter \n 1 for pizza --> ₹200 \n 2 for Burger –-> ₹120 \n 3 for Biryani –-> ₹180\n 4 for Noodles –-> ₹100 ");
		int opestion = sc.nextInt();
		switch(opestion) {
		case 1 -> {
			System.out.println("Enter the quantity ");
			quantity=sc.nextInt();
			bill+=200*quantity;
		}
		case 2 -> {
			System.out.println("Enter the quantity ");
			quantity=sc.nextInt();
			bill+=120*quantity;
		}
		case 3 -> {
			System.out.println("Enter the quantity ");
			quantity=sc.nextInt();
			bill+=180*quantity;
		}
		case 4 -> {
			System.out.println("Enter the quantity ");
			quantity=sc.nextInt();
			bill+=100*quantity;
		}
		}
		System.out.println("Do you want to add more..?(true/false)");
		yn =sc.nextBoolean();
		}while (yn);
		System.out.println("Your total bill is :"+bill);
		
		System.out.println("Payment mode \n 1.At counter \n 2.UPI");
		int payType=sc.nextInt();
		if(payType==1) {
			System.out.println("Token Number \n   "+ ++tokenNo);
		}else {
			System.out.println("UPI is not avaliable pay at counter");
			System.out.println("Token Number \n   "+ ++tokenNo);
		}
	}

}
