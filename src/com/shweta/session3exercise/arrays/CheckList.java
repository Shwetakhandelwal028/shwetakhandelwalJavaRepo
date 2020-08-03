package com.shweta.session3exercise.arrays;

import java.util.Scanner;

public class CheckList {

	public static void main(String[] args) {
		
		String []items = {"bread", "butter", "rice", "wheatFlour", "curd", 
				"biscuits" , "sugar", "coffee", "milk", "maggi"};
		
		System.out.println("This is a grocery list");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the item that you want to find");
		String item = input.nextLine();
		
		int count = 0;
		
		for(int i = 0; i < items.length; i++) {
			if(items[i].equals(item)) {
				
				System.out.println(items[i]+" is present in the list at index "
				+ (i+1) );
				
				count = 1;
			}
		}
		
		if (count <= 0) {
			System.out.println("Item is not present in the list, please buy this item from the shop");
		}

	}

}
