package com.languagefundamentals.method;

import java.util.Scanner;

public class TestMethodDemo2 {

	static Scanner sc = new Scanner(System.in);

//	Basic Methods
//	Print a person's name
	static String readPersonName() {
		System.out.print("Enter Person Name:");
		String s = sc.nextLine();
		return s;
	}

	static void displayPersonName(String s) {
		System.out.println("Person Name is :" + s);
	}

//	Print a person's age
	static int readAge() {
		System.out.print("Enter Person Age:");
		int age = sc.nextInt();
		return age;
	}

	static void displayPersonAge(int age) {
		System.out.println("Person age is :" + age);
	}

//	Print name and age
	static void displayNameAndAge(String s, int age) {
		System.out.println("Person Name is :" + s);
		System.out.println("Person Age is :" + age);
	}

//	Print college name
	static String readCollegeName() {
		System.out.print("Enter College Name:");
		String college = sc.next();
		return college;
	}

	static void displayCollegeName(String s) {
		System.out.println("College Name is :" + s);
	}

//	Print student ID
	static int readStudentId() {
		System.out.print("Enter Student Id:");
		int id = sc.nextInt();
		return id;
	}

	static void displaystudentId(int id) {
		System.out.println("Student id is :" + id);
	}

//	Print two numbers
	static void readTwoNumbers() {
		System.out.println("Enter two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		add(a, b);
	}

//	Print three numbers
	static void printThreeNumbers(int a, int b, int c) {
		System.out.println("The Three numbers are " + a + "," + "," + b + "," + c);
	}

//	Print a message
	static void sample() {
		System.out.println("This is a sample method !!");
	}

//	Print a city name
	static void cityName() {
		System.out.println("Hyd");
	}

//	Print a phone number
	static void phoneNumber() {
		System.out.println("8309617699");
	}

//	Mathematical Methods
//	Add two numbers
	static void add(int a, int b) {
		System.out.println("The sum of two numbers is :" + (a + b));
	}

//	Subtract two numbers
	static void sub(int a, int b) {
		System.out.println("The difference is:" + (a - b));
	}

//	Multiply two numbers
	static void mul(int a, int b) {
		System.out.println("The product is:" + (a * b));
	}

//	Divide two numbers
	static void div(int a, int b) {
		System.out.println("The difference is:" + (a / b));
	}

//	Find remainder
	static void modd(int a, int b) {
		System.out.println("The remainder is :" + (a % b));
	}

//	Find square of a number
	static void square(int a) {
		System.out.println("The Square of a number is :" + (a * a));
	}

//	Find cube of a number
	static void cube(int a) {
		System.out.println("The cube of the number is:" + (a * a * a));
	}

//	Print multiplication table
	static void tabel(int a) {
		System.out.println("The table of " + a);
		for (int i = 1; i <= 10; i++) {
			System.out.println(a + " x " + i + " = " + (a * i));
		}
	}

//	Print numbers from 1 to N
	static void printNumbers(int a) {
		System.out.println("Printing the number from 1 to " + a);
		for (int i = 1; i <= a; i++) {
			System.out.print(i+ " ");
		}
	}

//	Print even numbers up to N
	static void printingEvenNumbers(int a) {
		System.out.println("Printing the even numbers up to " + a);
		for (int i = 1; i <= a; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " ");
			}
		}
	}

//	Print odd numbers up to N
	static void printingOddNumbers(int a) {
		System.out.println("Printing the Odd numbers up to " + a);
		for (int i = 1; i <= a; i++) {
			if (i % 2 != 0) {
				System.out.println(i + " ");
			}
		}
	}

//	Print factors of a number
	static void factorsOfNumber(int a) {
		System.out.println("Printing the factors of number " + a);
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				System.out.println(i + " ");
			}
		}
	}

//	Print factorial calculation steps
	static int printFactorialSteps(int a) {
		int fact = 1;
		if (a == 0) {
			System.out.println("0! is " + 1);
		} else {
			for (int i = 1; i <= a; i++) {
				if (i + 1 <= a) {
					System.out.print(i + " * ");
					fact *= i;
				} else {
					System.out.print(i+" = ");
					fact *= i;
				}
			}
		}
		System.out.println(fact);
		return fact;
	}

//	Print sum of two numbers
	static int sumOfTwoNumbers(int a, int b) {
		int sum = a + b;
		return sum;
	}

//	Print average of three numbers
	static int averageOfThreeNumbers(int a, int b, int c) {
		int avg = (a + b + c) / 3;
		return avg;
	}

//	Print largest of two numbers
	static int largerstOfTwoNumbers(int a, int b) {
		int largest;
		if (a > b) {
			largest = a;
		} else {
			largest = b;
		}
		return largest;
	}

//	Print smallest of two numbers
	static int smallestOfTwoNumbers(int a, int b) {
		int smallest;
		if (a > b) {
			smallest = b;
		} else {
			smallest = a;
		}
		return smallest;
	}

//	Print largest of three numbers
	static int largestOfThreeNumbers(int a, int b, int c) {
		int largest;
		if (a > b && a > c) {
			largest = a;
		} else if (b > a && b > c) {
			largest = b;
		} else {
			largest = c;
		}
		return largest;
	}

//	Print smallest of three numbers
	static int smallestOfThreeNumbers(int a, int b, int c) {
		int smallest;
		if (a < b && a < c) {
			smallest = a;
		} else if (b < a && b < c) {
			smallest = b;
		} else {
			smallest = c;
		}
		return smallest;
	}

//	Print whether a number is positive or negative
	static void findNumber(int a) {
		if (a >= 0) {
			System.out.println("The give Number " + a + " is Positive Number");
		} else {
			System.out.println("The give Number " + a + " is negative Number");
		}
	}

//	Number Checking
//	Check whether a number is even
	static void evenNumber(int a) {
		if (a % 2 == 0) {
			System.out.println("The given number is even number");
		} else {
			System.out.println("The give number is not an even number");
		}
	}

//	Check whether a number is odd
	static void oddNumber(int a) {
		if (a % 2 != 0) {
			System.out.println("The given number is odd number");
		} else {
			System.out.println("The give number is not an odd number");
		}
	}

//	Check whether a number is prime
	static void primeNumber(int a) {
		int count = 0;
		for (int i = 1; i < a / 2; i++) {
			if (a % i == 0) {
				count++;
			}
		}
		if (count > 1) {
			System.out.println("The given number is not a prime number");
		} else {
			System.out.println("The given number is prime number");
		}
	}

//	Check whether a number is a palindrome
	static boolean isPalindrome(int a) {
		boolean pal=false;
		int n=a;
		int reverse=0;
		while(n!=0) {
			int rem=n%10;
			reverse=(reverse*10)+rem;
			n/=10;
		}
		if(a==reverse) {
			pal=true;
		}
		return pal;
	}

	
	
//	Check whether a number is an Armstrong number (1^3+5^3+3^3=153)(1^4+6^4+3^4+4^4=1634)
	static boolean armstrongNumber(int a) {
		int len=String.valueOf(a).length();
		boolean isarms=false;
		int n=a;
		int arms=0;
		while(n!=0) {
			int rem=n%10;
			arms=(rem*rem*rem)+arms;
			n/=10;
		}
		if(a==arms) {
			isarms=true;
		}
		return isarms;
	}
	
	
	// 39+9+15=63;
//	Check whether a number is a perfect number  1 + 2 + 4 + 7 + 14 = 28
//	Check whether a number is a strong number 1!+ 4! + 5! = 1 + 24 + 120 = 145
//	Check whether a number is a neon number
//	Check whether a number is a spy number
//	Check whether a number is a Harshad number
	public static void main(String[] args) {

//		Print a person's name
		String pname = readPersonName();
		displayPersonName(pname);

//		Print a person's age
		int page = readAge();
		displayPersonAge(page);

//		Print name and age
		displayNameAndAge(pname, page);

//		Print college name
		String college = readCollegeName();
		displayCollegeName(college);

//		Print student ID
		int sid = readStudentId();
		displaystudentId(sid);
		
// 		is the given number is armstrong or not 
		boolean arms=armstrongNumber(153);
		System.out.println(arms);
		
//		Print two numbers
		readTwoNumbers();
		
//		Print three numbers
		printThreeNumbers(1,2,3);
		
//		Print a message
		sample();

//		Print a city name
		cityName() ;
		
//		Print a phone number
		phoneNumber() ;
		
//		Add two numbers
		add(10,20);
		
//		Subtract two numbers
		sub(20,10);
		
//		Multiply two numbers
		mul(5,3);
		
//		Divide two numbers
		div(8,2);
		
//		Find remainder
		modd(4,2);
		
//		Find square of a number
		square(5);
		
//		Find cube of a number
		cube(2);
		
//		Print multiplication table
		tabel(55);
		
//		Print numbers from 1 to N
		printNumbers(5) ;
		
//		Print even numbers up to N
		printingEvenNumbers(10);
		
//		Print odd numbers up to N
		printingOddNumbers(10); 
		
//		Print factors of a number
		factorsOfNumber(10) ;
		
//		Print factorial calculation steps
		printFactorialSteps(5) ;

//		Print sum of two numbers
		sumOfTwoNumbers(50,10) ;
		
//		Print average of three numbers
		averageOfThreeNumbers(30, 10,20);
		
//		Print largest of two numbers
		largerstOfTwoNumbers(52,50);
		
//		Print smallest of two numbers
		smallestOfTwoNumbers(40,45);
		
//		Print largest of three numbers
		largestOfThreeNumbers(44, 66,55);
		
//		Print smallest of three numbers
		smallestOfThreeNumbers(40, 60,50);
		
//		Print whether a number is positive or negative
		findNumber(-100);
		
//		Number Checking
//		Check whether a number is even
		evenNumber(4); 
		
//		Check whether a number is odd
		oddNumber(5);
		
//		Check whether a number is prime
		primeNumber(40);
		
//		Check whether a number is a palindrome
		isPalindrome(121);
	}

}
