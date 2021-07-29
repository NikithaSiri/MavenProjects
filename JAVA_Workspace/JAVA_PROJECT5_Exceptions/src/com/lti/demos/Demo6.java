package com.lti.demos;



	//****Exceptions behaviour in inheritance / in method overriding 
	//method overriding example 
	/*If super class method does not declare any exception, 
	 then sub class overriden method cannot declare checked exception 
	 							but it can declare unchecked exceptions.*/

	class SuperClass {   
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
	}
	public class Demo6 {

		public static void main(String[] args) {		
			SuperClass s = new SubClass(); 
	        s.method(); 		
		}
	}



