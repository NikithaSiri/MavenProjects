package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;


class TestExcep {

	 @Test
	    public void testUsernameIsNull() {	         
	       assertThrows(IllegalArgumentException.class, new Executable() {	             
	            public void execute() throws Throwable {	            	
	                User user = new User();
	                user.setName(null);
	            }
	        });	       
	    }
	 
	 //same can be written using lambda 
	@Test
	 public void testUsernameIsNull1() {
	  
	     assertThrows(IllegalArgumentException.class, () -> {
	         User user = new User();
	         user.setName(null);
	     });
	 }
	
	@Test
	public void checkSetName()
	{
		
	}
	 
	@Test
	public void testUsernameIsNull2() {
		
		Throwable exception = assertThrows(
				IllegalArgumentException.class, () -> {
					User user=new User();
					user.setName(null);
				}
				);
		Assertions.assertEquals("Username cannot be blank", exception.getMessage());
				
		}
	
@Test
public void testUsernameTooShort() {
    Throwable exception = assertThrows(
            IllegalArgumentException.class, () -> {
                User user = new User();
                user.setName("Jo");
            }
    );
 
    Assertions.assertEquals("Username is too short", exception.getMessage());     
}


@Test
public void testUsernameTooLong() {
    Throwable exception = assertThrows(
            IllegalArgumentException.class, () -> {
                User user = new User();
                user.setName(" Hello Hello World World Hi All ");
            }
    );
 
    Assertions.assertEquals("Username is too long", exception.getMessage());      
}

}


/*
* JUnit 5 provides the assertThrows() method that 
* asserts a piece of code throws an exception of an expected type and returns the exception:
assertThrows(Class<T> expectedType, Executable executable, String message)

You put the code that can throw exception in the execute() method of an Executable type -
Executable is a functional interface defined by JUnit. 
The message is optional, to be included in the error message printed when the test fails.
For example, the following test class implements a test method that 
asserts IllegalArgumentException is thrown by the setName() method of the User class:
*/

