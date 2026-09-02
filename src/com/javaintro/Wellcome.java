package com.javaintro;

// If we need excite the program with out calling a method in the main method then we need to create the static block which has only static and method calling in it
// or we can do it with the instance block but main should not contain static in main method creation

public class Wellcome {
	 {

		student();
		tranier();
		institue();
		Lab();
		College();
		degree();
		Bike();
		car();
	}

	 public void main(String[] args) {

	}

	public void student() {
		System.out.println("Name:Abishay");
		System.out.println("course:jfs");
	}

	public void tranier() {
		System.out.println("Java:Srikanth");
		System.out.println("Mysql:viswanath");
	}
	
	public void institue() {
		System.out.println("Vcube");
	}
	
	public void Lab() {
		System.out.println("java lab");
		System.out.println("sql lab");
	}
	
	public  void College() {
		System.out.println("srkr");
	}
	
	public  void degree() {
		System.out.println("Btech");
	}
	
	public  void Bike() {
		System.out.println("R15");
	}
	
	public  void car() {
		System.out.println("nothing");
	}

}
