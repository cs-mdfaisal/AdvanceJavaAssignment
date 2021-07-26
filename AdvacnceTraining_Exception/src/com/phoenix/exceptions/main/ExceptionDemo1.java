package com.phoenix.exceptions.main;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int result=10/0;
			//int divisor=0;
			//if(divisor==0) {
				//throw new ArithmeticException("cn not divide");
				System.out.println("Division is "+result);
			
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

}
