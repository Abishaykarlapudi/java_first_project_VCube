package com.javaintro;

import java.util.Scanner;

public class Movie {
	Scanner sc=new Scanner(System.in);
	
	static String theatreName;
	static String theatreLocation;
	
	String MovieName;
	int movieBudget;
	String releaseDate;

	void read() {
		System.out.print("Enter the Movie Name:");
		MovieName=sc.next();
		System.out.print("Enter the Movie Budget:");
		movieBudget=sc.nextInt();
		System.out.print("Enter the Movie Release Date:");
		releaseDate=sc.next();
		System.out.println("\n");
	}
	
	void display() {
		System.out.println("The Theatre Name is "+Movie.theatreName);
		System.out.println("The theatre Location is "+Movie.theatreLocation);
		System.out.println("The movie Name is "+MovieName);
		System.out.println("The Movie Budget is "+movieBudget);
		System.out.println("The movie Release Date is "+releaseDate+"\n");
	}
	
	public static void main(String[] args) {
		Movie m1 = new Movie();
		Movie m2 = new Movie();
		Movie m3 = new Movie();
		
		theatreName="Arjun";
		theatreLocation="kphb";
		
		m1.read();
		m2.read();
		m3.read();
		
		m1.display();
		m2.display();
		m3.display();
	}

}
