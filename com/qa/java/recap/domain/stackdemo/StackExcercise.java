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
		completedNumber(3);
	}
	
	public static int completedNumber(int compNum) {
		System.out.println("completed" + compNum);
		return compNum;
	}
	
}
