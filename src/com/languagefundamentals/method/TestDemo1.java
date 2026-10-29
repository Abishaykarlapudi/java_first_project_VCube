package com.languagefundamentals.method;

public class TestDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		addition(10, 10);
		System.out.println("main method ended");
	}

	static void addition(int a, int b) {
		System.out.println("Addition method called");
		System.out.println(a + b);
		subraction(a + b, 10);
	}

	static void subraction(int a, int b) {
		System.out.println("subraction method called");
		System.out.println(a - b);
		multiplication(a - b, 20);
	}

	static void multiplication(int a, int b) {
		System.out.println("Multiplication method called");
		System.out.println(a * b);
		division(a * b, 10);
	}

	static void division(int a, int b) {
		System.out.println("division method called");
		System.out.println(a / b);
	}

}
