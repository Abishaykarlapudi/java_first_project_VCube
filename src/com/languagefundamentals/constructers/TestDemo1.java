package com.languagefundamentals.constructers;

public class TestDemo1 {
	
	int a;
	String s;
	TestDemo1(){
//		two types 
//		1. this();--> local gaa unna cons invoke ;
		System.out.println("**********************************************");
		System.out.println("no arg constructer");
		this(1);
		
	}
	
	
	
	TestDemo1(int a){
		System.out.println("**********************************************");
		System.out.println("one arg constructer");
		System.out.println("value :" + a);
		this(a,"unkown");
	}
	
	
	
	TestDemo1(int a,String s){
		System.out.println("**********************************************");
		System.out.println("two arg constructer");
		System.out.println("value :" + a);
		System.out.println("value :" + s);
	}
	
	public static void main(String[] args) {
		System.out.println("Main method called");
		
		
		System.out.println("*******************First object******************");
		TestDemo1 d=new TestDemo1();
		
		
		
		
		System.out.println("*******************Second object******************");
		TestDemo1 d1=new TestDemo1(10,"abishay");
		
		
		
		
		System.out.println("*******************Third object******************");
		TestDemo1 d2 =new TestDemo1(20);
		
		
		System.out.println("Main method ended");
	}
}
