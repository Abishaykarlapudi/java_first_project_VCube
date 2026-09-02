package com.javaintro;

public class Task1 {

	static int count=0;
	
	
	{
		count++;
	}
	public static void main(String[] args) {
		
		Task1 t1=new Task1();
		Task1 t2=new Task1();
		Task1 t3=new Task1();
		Task1 t4=new Task1();
		
		System.out.println("Total objects created:"+count);
	}

}
