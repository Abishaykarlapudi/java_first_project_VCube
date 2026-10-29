package com.languagefundamentals.method;

import java.util.Scanner;

public class BugTracker {

	static Scanner sc=new Scanner(System.in);
	
	int bugid;
	String applicationname;
	String bugtitle;
	String severity;
	String priority;
	String status;
	String assigneddeveloper;
	
	void readBugDeatils() {
		System.out.print("Enter the bug id:");
		bugid=sc.nextInt();
		System.out.print("Enter the application Name:");
		applicationname=sc.next();
		System.out.print("Enter the bug Title:");
		bugtitle=sc.next();
		System.out.print("Enter the Severity:");
		severity=sc.next();
		System.out.print("Enter the Priority:");
		priority=sc.next();
		sc.nextLine();
		System.out.print("Enter the Status of the Bug:");
		status=sc.nextLine();
		System.out.print("Enter the Assigned Developer:");
		assigneddeveloper=sc.next();
		if (assigneddeveloper != null) {
				assigntodeveleoper(bugid,assigneddeveloper);
		}
	}
	
	
	private void assigntodeveleoper(int bugid2, String assigneddeveloper2) {
		updateStatues("In development");
	}

	private void updateStatues(String string) {
		status=string;
	}

	void displayBugDetails() {
			System.out.println("The bug id is :"+bugid);
			System.out.println("The Application Name :"+applicationname);
			System.out.println("The Bug Title :"+bugtitle);
			System.out.println("The Severity of the bug :"+severity);
			System.out.println("The Priortiy:"+priority);
			System.out.println("The Bug Statues:"+status);
			System.out.println("The Assigned Developer :"+assigneddeveloper);
	}

//	
//	int butid() {
//		int bugid=sc.nextInt();
//		return bugid;
//	}
	
	
	public static void main(String args[]) {
		BugTracker b1=new BugTracker();
//		b1.bugid=butid();
		b1.readBugDeatils();
		b1.displayBugDetails();
	}

}
