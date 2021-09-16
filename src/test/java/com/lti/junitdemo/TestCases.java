package com.lti.junitdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class TestCases {
	 @Test
	 void testAssumeTrue() {
	      boolean b = "A" == "A";
	      Assumptions.assumeTrue(b);
	     // Assertions.assertEquals("Hello", "Hello");
	 }

	
	 @Test
	 void testAssumeFalse() {
	      boolean b = 'A' != 'A';
	      Assumptions.assumeFalse(b);
	      Assertions.assertEquals("Hello", "Hello");
	 }
}
