package com.javaintro;
import java.util.*;

public class Task {
	Scanner sc =new Scanner(System.in);
	int bookid;
	String booktitle;
	String authorName;
	int copies ;
	String libraryName;
	String librarian;
	
	public static void main(String[] args) {
		
		Task a=new Task();
		a.readDetails();
		a.displayBookDetails();
		a.issueBook();
		a.displayLibraryDetails();
		a.changeLibrarian();
		a.displayBookDetails();
		a.displayLibraryDetails();
	}
	
	public void readDetails() {
		System.out.print("Enter the book id:");
		bookid=sc.nextInt();
		System.out.print("Enter the book Title:");
		booktitle=sc.next();
		System.out.print("Enter the book author name:");
		authorName=sc.next();
		System.out.print("No.of copies:");
		copies=sc.nextInt();
		System.out.println("Enter the library Name:");
		libraryName=sc.next();
		System.out.println("Enter the librarian Name:");
		librarian=sc.next();
	}
	
	public void displayBookDetails() {
		System.out.println(bookid);
		System.out.println(booktitle);
		System.out.println(authorName);
	}
	
	public void issueBook(){
		copies--;
	}
	
	public void displayLibraryDetails() {
		System.out.println("library Name:"+libraryName);
		System.out.println("librarian Name:"+librarian);
	}
	
	public void changeLibrarian() {
		System.out.print("Enter the new librarian name:");
		librarian=sc.next();
	}
}
