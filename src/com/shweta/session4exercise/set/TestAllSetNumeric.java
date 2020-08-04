package com.shweta.session4exercise.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestAllSetNumeric {

	public static void main(String[] args) {
		
	Set<Double> priceSet = new HashSet<Double>();
	priceSet.add(55.56);
	priceSet.add(22.37);
	priceSet.add(55.56);
	priceSet.add(202.57);
	priceSet.add(100.5);
	
	System.out.println("Price set "+ priceSet);
	System.out.println("---------------");
	
	Set<Integer> numberSet = new LinkedHashSet<Integer>();
	numberSet.add(28);
	numberSet.add(3);
	numberSet.add(26);
	numberSet.add(5);
	numberSet.add(4);
	
	System.out.println("Number set "+ numberSet);
	System.out.println("---------------");
	
	
	Set<Float> tempSet = new TreeSet<Float>();
	tempSet.add(59.37f);
	tempSet.add(40.0f);
	tempSet.add(67.87f);
	tempSet.add(34.5f);
	tempSet.add(55.8f);
	
	System.out.println("Temperature set "+ tempSet);
	

	}

}
