package com.logicalstatements;

import java.util.Scanner;

public class ElectricityBill {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Wellcome to Vcube ElectricityBill");

		String connectionType = "";
		Double unitsConsumed = 0.0;
		Integer ratePerUnit = 0;
		Double bill = 0.0;

		System.err.println("Enter   connection type\r\n" + "1) → Domestic\r\n" + "2) → Commercial");
		Integer conType = sc.nextInt();
		switch (conType) {

		case 1 -> {
			connectionType = "Domestic";
			System.err.println("Enter  units :");
			unitsConsumed = sc.nextDouble();

			if (unitsConsumed < 0) {
				System.out.println("Enter the valid units");
			} else if (unitsConsumed < 100) {
				ratePerUnit = 2;
				bill += unitsConsumed * ratePerUnit;
			} else {
				ratePerUnit = 3;
				bill += unitsConsumed * ratePerUnit;
			}

		}

		case 2 -> {

			connectionType = "Commercial";

			System.err.println("Enter  units :");
			unitsConsumed = sc.nextDouble();

			if (unitsConsumed < 0) {
				System.out.println("Enter the valid units");
			} else if (unitsConsumed < 100) {
				ratePerUnit = 4;
				bill += unitsConsumed * ratePerUnit;
			} else if (unitsConsumed >= 100 && unitsConsumed < 300) {
				ratePerUnit = 6;
				bill += unitsConsumed * ratePerUnit;
			} else {
				ratePerUnit = 8;
				bill += unitsConsumed * ratePerUnit;
			}

		}
		
		default -> System.out.println("Invalid input");

		}
		
		System.out.println("Connection Type :"+connectionType+"\nUnits Consumed :"+unitsConsumed+"\nRate Per Unit :"+ratePerUnit+"\nTotal Electricity Bill:"+bill);
		
	}

}
