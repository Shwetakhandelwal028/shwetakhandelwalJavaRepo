package com.shweta.session1exercise;

import java.util.Scanner;

public class StringConversion {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 1 to 120");
		String number = sc.nextLine();
		int numInt = Integer.parseInt(number);
		float numFloat  = Float.parseFloat(number);
		double numDouble = Double.parseDouble(number);
		byte numByte = Byte.parseByte(number);
		
		System.out.println("String is : " + number);
		System.out.println("Integer number is : " + numInt);
		System.out.println("Float number is : " + numFloat);
		System.out.println("Double number is : " + numDouble);
		System.out.println("Byte number is : " + numByte);

}
}
