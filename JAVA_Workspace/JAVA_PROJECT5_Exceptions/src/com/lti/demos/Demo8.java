package com.lti.demos;

public class Demo8 {
	//*Class {   
    // SuperClass doesn't declare any exception 
    void method() 
    { 
        System.out.println("SuperClass"); 
    } 
}   
class SubClass extends SuperClass 
{   
     void method()  throws ArithmeticException //-> unchecked exp allwed // //checked exp throws IOException not allowed 
    { 
          System.out.println("SubClass");   
    } 



	public static void main(String[] args) {		
		SuperClass s = new SubClass(); 
        s.method(); 		
	}
}




