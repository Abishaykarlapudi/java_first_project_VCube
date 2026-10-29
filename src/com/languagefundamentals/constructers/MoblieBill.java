package com.languagefundamentals.constructers;

import java.util.Scanner;

public class MoblieBill {

	static Scanner sc = new Scanner(System.in);

	int MoblieBill() {
		System.out.println("*****************************************************");
		System.out.print("Enter the price of Mobile: ");
		int price = sc.nextInt();
		return price;
	}

	public MoblieBill(int price) {
		System.out.print("Enter the Mobile quantity : ");
		int quantity = sc.nextInt();
		this(price, quantity);
	}

	public MoblieBill(int price, int quantity) {
		if (price == 0) {
			System.out.println("Invalid mobile price !!");
			return;
		} else {
			System.out.println("*****************************************************");
			System.out.println("The Mobile cost is      :" + price);
			System.out.println("The quantity is         :" + quantity);
			System.out.println("The price is            :" + (price * quantity));
			System.out.println("The delivery charges is :" + (((price * quantity) * 0.05) / 100));
		}
		System.out.println("Total bill              :" + ((price * quantity) + (((price * quantity) * 0.05) / 100)));

	}

	public static void main(String[] args) {

		MoblieBill m1 = new MoblieBill(0);
//		MoblieBill m2 = new MoblieBill(20000,2);
//		MoblieBill m3 = new MoblieBill();
		m1.MoblieBill();
	}

}
