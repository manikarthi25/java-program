package com.java.program.interview;

public class Test {
	
	private String testString;
	
	public void method1(Test test) {
		test.testString = "method1";
	}
	
public void method2(Test test) {
	test = new Test();
	test.testString = "method2";
	System.out.println("Method 2 :" +test);
		
	}

	public static void main(String[] args) {
		Test test = new Test();
		test.testString = "Main Method";
		
		System.out.println(test.testString);
		
		test.method1(test);
		
		System.out.println(test.testString);
		
         test.method2(test);
		
         System.out.println("Main Method :" +test);
         
		System.out.println(test.testString);

		
	}
/*
Main Method
method1
Method 2 :com.java.program.interview.Test@39ed3c8d
Main Method :com.java.program.interview.Test@71dac704
method1

 */
}
