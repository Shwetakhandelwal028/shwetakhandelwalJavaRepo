package com.shweta.session9exercise.search;

import java.util.Scanner;

public class LinearSearch {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any 5 numbers");
		int intArr[] = new int[5];
		for(int i=0; i<5; i++) {
			intArr[i] = input.nextInt();
		}
		
	    System.out.println("Enter a number that you want to search");
	    int searchVal = input.nextInt();
	    int position = linearSearch(intArr, searchVal);
	    System.out.println("Element "+searchVal+ " is present at index "+position);
	    }
	
	
	public static int linearSearch(int[] input, int value ) {
		
		for(int index=0; index<input.length; index++) {
			if(value == input[index])
				return index;
		}
		
		return -1;
		
	}
}
