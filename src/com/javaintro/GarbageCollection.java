package com.javaintro;

class A{
	B b;
}

class B{
	
	A a;
}
public class GarbageCollection {
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize called:");
	}

	void display() {
		
		GarbageCollection g5=new GarbageCollection();
		System.out.println("Display method completed:");
		System.gc();
	}
	
	public static void main(String[] args) {
		System.out.println("Main method started");
		GarbageCollection g1=new GarbageCollection();
		GarbageCollection g2=new GarbageCollection();
		GarbageCollection g3=new GarbageCollection();
		GarbageCollection g4=new GarbageCollection();

		
//		Nullifying Reference the object
		g1=null;
		
		
//		Reassigning Reference the object 
		g2=g4;
		
		
//		Out of Scope 
		g3.display();
		
		
//		Anonymous Objects
		new GarbageCollection();
		
		
//		 Island of Isolation
		A g6=new A();
		B g7=new B();
		g6.b=g7;
		g7.a=g6;
		
		g6=null;
		g7=null;
		System.gc();
		System.out.println("Main method ended");		
	}

}
