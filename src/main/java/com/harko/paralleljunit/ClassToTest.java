package com.harko.paralleljunit;

public class ClassToTest {


	public static int methodToTest() throws InterruptedException {
		// Pause for two minutes and return the magic number
		Thread.sleep(60000 * 2); 
		return 42; 
	}


}