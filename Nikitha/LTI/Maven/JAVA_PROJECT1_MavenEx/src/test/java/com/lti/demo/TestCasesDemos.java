package com.lti.demo;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TestCasesDemos {

	@Test
	public void testAddProduct()
	{
		Product p=new Product(101,"mobile",30000);
		ProductService ps= new ProductService();
		Assertions.assertEquals("Product Added", ps.addProduct(p));
	}
	
	@Test
	public void testIcard()
	{
		Product p=new Product(101,"mobile",30000);
		Assertions.assertEquals("LTI Infotech",p.getCompanyName());
	}
	/*@BeforeAll
	
	static void setUp()
	{
	System.out.println("\n @BeforeAll");	
	}
	
	@BeforeEach
	void setUp1()
	{
		System.out.println("@BeforeEach");
	}*/
	/*@Test
	void test() {
		//fail("Not yet implemented");
		
		Assertions.assertEquals("LTI","LTI");
		
	}*/
@Test
void testCalculatorSumMethod()
{
	
	Calculator c=new Calculator();
	int r=c.sum(100, 200);
	Assertions.assertEquals(300, r);

}
@Test
void testCalculatorSumMethod1()
{
	
	Calculator c=new Calculator();
	int r=c.sum(100, -200);
	Assertions.assertEquals(-100, r);

}
@Test
@Disabled
public void testAry() {
	
	ArrayList<String> myList= new ArrayList<>();
	myList.add("hello");
	Assertions.assertFalse(myList.isEmpty());
	//Assertions.assertTrue(myList.isEmpty());
}
/*@AfterEach
 void tearMethods()
{
	System.out.println("@AfterEach method");
}
@AfterAll
static void tearAll()
{
	System.out.println("\n @AfterAll");
}
*/
}
