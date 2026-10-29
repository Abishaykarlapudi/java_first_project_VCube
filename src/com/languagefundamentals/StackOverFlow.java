package com.languagefundamentals;

public class StackOverFlow {

	static StackOverFlow s1 = new StackOverFlow();
	{
		System.out.println("Instance block");
	}
	static StackOverFlow s2 = new StackOverFlow();
	public static void main(String[] args) {
		System.out.println("main method");
	}

}
