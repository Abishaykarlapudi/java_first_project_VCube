package com.languagefundamentals.method;

public class TestMethodDemo3 {

//	Slightly Advanced
//	Print array elements
	
	void displayArray(int[] nums) {
		System.out.println("*********************************");
		for(int i=0;i<nums.length;i++) {
			System.out.println("The Number:"+nums[i]);
		}
		System.out.println("*********************************");
	}
	
	
//	Print even elements of an array
	void evenNumsInArray(int[] nums) {
		System.out.println("*********************************");
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2==0) {
				System.out.println("Even Number is:"+nums[i]);
			}
		}
		System.out.println("*********************************");
	}
//	Print odd elements of an array
	void oddNumsInArray(int[] nums) {
		System.out.println("*********************************");
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2!=0) {
				System.out.println("Odd Number is:"+nums[i]);
			}
		}
		System.out.println("*********************************");
	}
//	Print largest element of an array
	void largestNumsInArray(int[] nums) {
		System.out.println("*********************************");
		int largest=nums[0];
		for(int i=1;i<nums.length;i++) {
			if(largest<nums[i]) {
				largest=nums[i];
			}
		}
		System.out.println("The Largest Number is:"+largest);
		System.out.println("*********************************");
	}
	
	
//	Print smallest element of an array
	void smallestNumsInArray(int[] nums) {
		System.out.println("*********************************");
		int smallest=nums[0];
		for(int i=0;i<nums.length;i++) {
			if(smallest>nums[i]) {
				smallest=nums[i];
			}
		}
		System.out.println("The Smallest Number:"+smallest);
		System.out.println("*********************************");
	}
//	Print sum of array elements
	void sumNumsInArray(int[] nums) {
		System.out.println("*********************************");
		int sum=0;
		for(int i=0;i<nums.length;i++) {
			sum+=nums[i];
		}
		System.out.println("The Sum Numbers:"+sum);
		System.out.println("*********************************");
	}
	
	
//	Print duplicate elements of an array
	void duplicateNumsInArray(int[] nums) {
		System.out.println("*********************************");
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]==nums[j]) {
					System.out.println("The Duplicate Number is :"+nums[i]);
				}
			}
		}
		System.out.println("*********************************");
	}
	
	
//	Print reversed array
	void displayReversedArray(int[] nums) {
		System.out.println("*********************************");
		for(int i=nums.length-1;i>=0;i--) {
			System.out.println("The Reverse Number:"+nums[i]);
		}
		System.out.println("*********************************");
	}
	
	
//	Print frequency of an element
	
	
	
//	Print a complete student report using multiple parameters
	
	
	
	public static void main(String[] args) {
		TestMethodDemo3 t1 = new TestMethodDemo3();
		int nums[]= {1,2,3,4,5,6,7,8,9,8,7,8};
		t1.displayArray(nums);
		t1.displayReversedArray(nums);
		t1.duplicateNumsInArray(nums);
		t1.evenNumsInArray(nums);
		t1.largestNumsInArray(nums);
		t1.oddNumsInArray(nums);
		t1.smallestNumsInArray(nums);
		t1.sumNumsInArray(nums);
		
	}

}
