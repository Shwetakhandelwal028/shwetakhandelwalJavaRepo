package com.shweta.session10exercise.search;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		
		int intArr[] = {-22, -15, -8, -2, 1, 8, 15, 26, 40, 56};
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number that you want to search");
		int searchVal = input.nextInt();
	    
		int position = binarySearch(intArr, searchVal);
		System.out.println("Element "+searchVal+ " is present at index "+position);
		

	}
	
	public static int binarySearch(int[] input, int searchVal ) {
		
		int start = 0;
		int end = input.length-1;
		
		while(start < end) {
			
			int mid = (start + end)/2;
			if(input[mid] == searchVal) {
				return mid;
			}
			else if(input[mid] < searchVal) {
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
			}
		return -1;
		}
		
		
				
	}


