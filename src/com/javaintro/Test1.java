package com.javaintro;

public class Test1 {
	static int blockcount=0;
	
	
	{
		Test1.blockcount++;
	}
	public static void main(String[] args) {
		Test1 t1=new Test1();
		System.out.println(blockcount);
	}

}
