// The module file must be at the root level means at the top of the file other wise we will get error when we import the other imported libraries or files
package com.javaintro;

public class Student {
	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("This is start of the method");
		Class.forName("com.javaintro.Wellcome");// this is loaded my the application class loader
		System.out.println("Wellcome class completed");
		Class.forName("com.mysql.cj.jdbc.Driver");// this is loaded by the application class loader
		Class.forName("java.lang.String");// This class is loaded by the bootstrap class loader
		System.out.println("This is end of the method");
	}
}


//Ever class which comes form the java  in build they are loaded by the bootstrap class loader
//Ever class which we create by us or the extenuation or references libraries are loaded by the application class loader` 