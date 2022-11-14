package com.lti.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	Calculator c = new Calculator();
	
	@Test
	
	
	
	public void testsayHello()
	{
		Assertions.assertEquals("hello",c.sayHello());
	}
	
	@Test
	public void testadd() {
		Assertions.assertEquals(100, c.add(60,40),"Check the code again");
	}
	
	@Test
	void testAssertFalse()
	{
		Assertions.assertTrue("meenal".length()==6);
		Assertions.assertFalse("meenal".length()==10); //runs if condition is false
		Assertions.assertNotEquals("Hello","hello");
	}
	
	@Test
	void testAssertNull()
	{
		String str1=null;
		String str2="abcd";
		Assertions.assertNull(str1);
		Assertions.assertNotNull(str2);
		
	}
	
	@Test
	public void searchEmpId(int empid)
    {
        if(empid==0)
        {
            throw new ArithmeticException("u enetered zero");
        }
        else
        {
            System.out.println(" do something");
        }
        
    }
	//public void testArrayList()
	//{
	//	ArrayList<Integer> myList = new ArrayList
	//}

	

}