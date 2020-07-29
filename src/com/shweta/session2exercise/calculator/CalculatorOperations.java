package com.shweta.session2exercise.calculator;

public class CalculatorOperations {

	public void addition(InputData in) {
	if(in.getNumber1() > 0 && in.getNumber2() > 0 ) 
	{
	double total = in.getNumber1() + in.getNumber2();
	in.setTotal(total);	
	}
	System.out.println("Addition is : "+ in.getTotal() );
	}
	
	public void substraction(InputData in) {
		
		if(in.getNumber1() > 0 && in.getNumber2() > 0 ) {
		double total = in.getNumber1() - in.getNumber2();
		in.setTotal(total);
		}
		System.out.println("Substraction is : "+ in.getTotal());
	}
   
	public void multiplication(InputData in) {
	
	 if(in.getNumber1() > 0 && in.getNumber2() > 0 ) {
	 double total = in.getNumber1() * in.getNumber2();
	 in.setTotal(total);
	 }
	 System.out.println("Multiplication is "+ in.getTotal());
	}
	
	public void division(InputData in) {
		
		if(in.getNumber1() > 0 && in.getNumber2() > 0 ) {
		 double total = in.getNumber1() / in.getNumber2();
		 in.setTotal(total);
		}
		 System.out.println("Division is "+ in.getTotal());
		}
		
}
