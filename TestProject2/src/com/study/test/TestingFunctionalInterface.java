package com.study.test;

@FunctionalInterface
public interface TestingFunctionalInterface {
	
//	void print(String keyword);
	int getInt(int num);
	
	public static void printString() {
		System.out.println("default method");
	}

}


