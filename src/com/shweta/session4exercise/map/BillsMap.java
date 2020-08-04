package com.shweta.session4exercise.map;

import java.util.Map;
import java.util.TreeMap;

public class BillsMap {

	public static void main(String[] args) {
		
		Map<Double, String> bills = new TreeMap<Double, String>();
		bills.put(2000.59, "Electricity Bill");
		bills.put(1000.0, "Internet Bill");
		bills.put(800.0, "Mobile Bill");
		bills.put(7089.69, "Grocery Bill");
		bills.put(400.0, "Water Bill");
		
		System.out.println("Sorted bills are :" + bills);

	}

}
