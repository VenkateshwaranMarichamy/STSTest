package com.study.test;

import java.util.stream.Stream;

public class MainClass1 {

	public static void main(String[] args) {
		Integer[] intArray = {1,2,3};
		int result = Stream.of(intArray).mapToInt(a -> a).min().getAsInt();
		System.out.println(result);

	}

}
