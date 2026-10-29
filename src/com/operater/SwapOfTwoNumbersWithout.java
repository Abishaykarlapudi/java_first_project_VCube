package com.operater;

public class SwapOfTwoNumbersWithout {

	public static void main(String args[]) {
		int a =10;
		int b=20;
		int c;
		System.out.println(a);
		System.out.println(b);
		
		c=a;
		a=b;
		b=c;
		System.out.println(a);
		System.out.println(b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
		
		a=b^a;
		b=a^b;
		a=b^a;
		System.out.println(a);
		System.out.println(b);
	}
	
}
