package com.lti.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.lti.demo.Calculator;
import com.lti.demo.MyApp;

class MyAppTest {

	//@Test
	//void test() {
		//fail("Not yet implemented");
	//}
	@Test
	void testShow()
	{
		MyApp m= new MyApp();
		String s=m.show();
		Assertions.assertEquals("hello maven", s);
	}
	@Test
	void testAdd()
	{
		int r=Calculator.add(10, 20);
		Assertions.assertEquals(30, r);
		                     //(expected,actual)
		Assertions.assertEquals(100,Calculator.add(50, 50),"Testing add method");
		Assertions.assertNotEquals(50, r) ;
	}
	@Test
	void testAssertFalse()
	{
		Assertions.assertFalse("Ram".length()==10);
		Assertions.assertFalse(10>20, "comparing two values");
	}
	@Test
	void testAssertNull()
	{
		String s1=null;
		String s2="abc";
		Assertions.assertNull(s1);
		Assertions.assertNotNull(s2);
	}
	/*@Test
	void testAssertAll()
	{
		String s1="abc";
		String s2="pqr";	
		String s3="xyz";
		Assertions.assertAll( 
		() -> Assertions.assertEquals(s1, "abc"),	
		() -> Assertions.assertEquals(s2, "pqr"),
		() -> Assertions.assertEquals(s3, "xyz"));
		
	}*/
	@BeforeAll
    static void setup(){
        System.out.println("only once in beg - @BeforeAll executed\n");
    }     
    @BeforeEach
    void setupThis(){
        System.out.println("@BeforeEach executed");
    }      
    @Test
    void testCalcOne() 
    {
        System.out.println("======TEST ONE EXECUTED=======");
        Assertions.assertEquals( 4 , Calculator.add(2, 2));
    }  
    //@Disabled
    @Test
    void testCalcTwo() 
    {
        System.out.println("======TEST TWO EXECUTED=======");
        Assertions.assertEquals( 6 , Calculator.add(2, 4));
    }    
    @AfterEach
    void tearThis(){
        System.out.println("@AfterEach executed");
    }     
    @AfterAll
    static void tear(){
        System.out.println("\n once aat the end - clean up @AfterAll executed");
    }
	
}


