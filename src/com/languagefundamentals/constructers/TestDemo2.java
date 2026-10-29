package com.languagefundamentals.constructers;

class Demo{
	String name;
	int age;
}


public class TestDemo2 extends Demo {
	
	void display() {
		System.out.println("The name is :"+name);
		System.out.println("The name is :"+age);
	}
	
	public static void main(String[] args) {
		TestDemo2 t=new TestDemo2();
		t.display();
	}
}
