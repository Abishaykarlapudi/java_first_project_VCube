package com.languagefundamentals.method;

public class NagaMethod {
	void addition(int a, int b) {
		System.out.println(a+b);
		subtraction(a+b,10);
	}
	void subtraction(int a, int b) {
		System.out.println(a-b);
		multiplication(a-b,10);
	}
	void multiplication(int a ,int b) {
		System.out.println(a*b);
		division(a*b,5);
	}
	void division(int a, int b) {
	System.out.println(a/b);
	module(a/b,10);
	}
	void module(int a, int b) {
		System.out.println(a%b);
	}
	

	public static void main(String[] args) {
		NagaMethod n1 = new NagaMethod();
		n1.addition(10,20);

	}

}
