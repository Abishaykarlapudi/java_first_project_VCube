package com.languagefundamentals.constructers;

class Vehicle {
	String type;

	Vehicle(String type) {
		this.type=type;

	}
}

class Car extends Vehicle {
	String brand;
	double price;

	Car(String type, String brand, double price) {
		super(type);
		this.brand=brand;
		this.price=price;
	}
}

public class EclectricCar extends Car {

	int batterycapacity;

	EclectricCar(String type, String brand, double price, int batterycapacity) {
		super(type, brand, price);
		

	}

	void display() {
		System.out.println("The car type is             :" + super.type);
		System.out.println("The car brand is            :" + super.brand);
		System.out.println("The car price is            :" + super.price);
		System.out.println("The car battery capacity is :" + this.batterycapacity);
	}

	public static void main(String[] args) {

		EclectricCar c1=new EclectricCar("electric","au",1500000,5000);
		c1.display();
		
	}

}
