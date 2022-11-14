package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class BeforeAfterTest {
	
Calculator c = new Calculator();


	@BeforeAll
	public static void testDbConn() {
		System.out.println(" db conn is up");
	}
	@Test
	
	
	
	
	public void testsayHello()
	{
		Assertions.assertEquals("hello",c.sayHello());
		System.out.println("Say Hello");
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
		System.out.println("test true false");
	}
	
	@Test
	void testAssertNull()
	{
		String str1=null;
		String str2="abcd";
		Assertions.assertNull(str1);
		Assertions.assertNotNull(str2);
		
	}
	
	@AfterAll
	public static void testDbClose()
	{
		System.out.println(" once - db conn is closed");
	}
	@AfterEach
	public void testCleanUp() {
		int sum = 0;
		System.out.println("clean up");
		
	}
}
