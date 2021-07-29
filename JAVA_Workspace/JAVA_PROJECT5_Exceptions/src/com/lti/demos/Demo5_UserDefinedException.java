package com.lti.demos;

class MyOwnException extends Exception
{
	@Override
	public String getMessage()
	{
		return "PLease enter number within range";
	}
}
public class Demo5_UserDefinedException {
public static void main(String[] args) {
	
	int n1=100;
	int n2=0;
	int result=0;
	try {
		result=calcDiv(n1,n2);
	System.out.println(result);
	}
	catch(MyOwnException e) {
		System.out.println("plz check value");
	}
	System.out.println("pgm continues");
}
public static int calcDiv(int num1,int num2) throws MyOwnException
{
	if(num2==0)
	{
		throw new MyOwnException(); // new object gets created by jvm of user defined 
	}
	else
	{
return num1/num2;	
}
}
}