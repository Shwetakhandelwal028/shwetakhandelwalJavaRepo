package com.shweta.session2exercise.calculator;

public class Main {

	public static void main(String[] args) {
		
		InputData in = new InputData(200, 40);
		CalculatorOperations op = new CalculatorOperations();
		op.addition(in);
		
		op.substraction(in);
		
		op.multiplication(in);
		
		op.division(in);
	

	}

}
