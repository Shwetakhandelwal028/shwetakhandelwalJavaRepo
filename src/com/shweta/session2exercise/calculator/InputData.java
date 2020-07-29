package com.shweta.session2exercise.calculator;

public class InputData {

	private int number1;
	private int number2;
    private double total;
	public int getNumber1() {
		return number1;
	}
	public void setNumber1(int number1) {
		this.number1 = number1;
	}
	public int getNumber2() {
		return number2;
	}
	public void setNumber2(int number2) {
		this.number2 = number2;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	public InputData() {
		super();
		
	}
	public InputData(int number1, int number2) {
		super();
		this.number1 = number1;
		this.number2 = number2;
		
	}
    
    
}
