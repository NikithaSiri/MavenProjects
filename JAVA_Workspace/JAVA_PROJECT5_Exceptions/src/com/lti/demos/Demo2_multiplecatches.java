package com.lti.demos;

public class Demo2_multiplecatches {
public static void main(String[] args) {
	int x=15,y=5,a=5,z;
	int arr[] = {10,5};
	try
	{
	int b = arr[5]/0; // output will be whichever exception comes first
	z = 500/10; //error
	System.out.println("z:" + z);
	//System.out.println(" This will not be Executed if error occurs");
	}
	catch(ArithmeticException e)
	{
		System.out.println("plz check for zero value");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("array going out of index");
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
}
}

//if we write the Exception e before all exceptions then error occurs bcoz its the superclass for all exceptions
