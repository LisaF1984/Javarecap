package com.qa.java.recap.domain.stackdemo;

public class StackExcercise {
	
	public static void primary(String name) {
		System.out.println("primary method called and hi" + name);
		secondary();
		
	}

	public static void secondary() {
		System.out.println("secondary method called");
		tertiary();
	}
	
	public static void tertiary() {
		System.out.println("tertiary method called");
	}
}
