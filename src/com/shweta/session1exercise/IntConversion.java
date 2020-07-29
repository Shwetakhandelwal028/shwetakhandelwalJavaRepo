package com.shweta.session1exercise;

import java.util.Scanner;

public class IntConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 1 to 120");
		int numInt = sc.nextInt();
		float numFloat  = numInt;
		double numDouble = numInt;
		byte numByte = (byte)numInt;
		
		System.out.println("Integer number is : " + numInt);
		System.out.println("Float number is : " + numFloat);
		System.out.println("Double number is : " + numDouble);
		System.out.println("Byte number is : " + numByte);

	}

}
