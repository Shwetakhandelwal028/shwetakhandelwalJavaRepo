package com.shweta.session4exercise.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class TestAllListNumeric {

	public static void main(String[] args) {
		
		List<Double> priceList = new ArrayList<>();
		priceList.add(29.87);
		priceList.add(90.7);
		priceList.add(109.8);
		priceList.add(48.86);
		priceList.add(100.50);
		priceList.add(1200.8);
		
        System.out.println("Price list "+ priceList);
        System.out.println("----------------");
        
        
        List<Float> listOfTemp = new Vector<>();
        listOfTemp.add(59.37f);
        listOfTemp.add(40.0f);
        listOfTemp.add(67.87f);
        listOfTemp.add(34.5f);
        listOfTemp.add(55.8f);
        
        System.out.println("Temperature list "+ listOfTemp);
        System.out.println("----------------");
        
        
        List<Integer> listOfDates = new LinkedList<>();
        listOfDates.add(28);
        listOfDates.add(3);
        listOfDates.add(26);
        listOfDates.add(5);
        listOfDates.add(4);
        
        System.out.println("Date list "+ listOfDates);
        
        
	}

}
