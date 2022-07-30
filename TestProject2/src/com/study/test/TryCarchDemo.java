package com.study.test;

public class TryCarchDemo {
	
	public static int tryCatchDemo() {
		try {
			System.out.println("try block");
			return 0;
	}catch(Exception e) {
		return 2;
	}finally {
		System.out.println("finally block");
		//return 3;
		
	}
	}
	public static void main(String[] args) {
		
		System.out.println(tryCatchDemo());
	}
	

}
