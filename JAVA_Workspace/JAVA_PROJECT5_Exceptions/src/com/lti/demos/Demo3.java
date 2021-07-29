package com.lti.demos;

public class Demo3 {

	public static void main(String[] args) {
		int arr[]= {10,5};
		try
		{
			arr[0]=100;
			int b=arr[0]/0;
			System.out.println("b: "+b);
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		// to close all the files and connections
		finally{
			System.out.println("Finally block");
		}
	}
}
