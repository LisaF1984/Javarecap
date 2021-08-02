package com.qa.java.recap.domain.stackdemo;

public class Stack {
	 public static void firstLayerString() {
		 System.out.println("First layer called");
		 firstLayer("test");
		 firstLayer("complete");
		 secondfLayerString();
		 thirdLayerString();
		 thirdLayerString();
		 System.out.println("First layer finished");
		 
	 }
	  
	public static void secondfLayerString() {
		System.out.println("second layer called");
		System.out.println("Second layer finished");
	}

	public static void thirdLayerString() {
		System.out.println("Third layer called");
		secondfLayerString();
		System.out.println("Third layer finished");
	}

	public static String firstLayer(String testString) {
		System.out.println(testString);
		return testString;
	}
 }
