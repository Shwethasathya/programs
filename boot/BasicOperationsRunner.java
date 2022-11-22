package com.xworkz.basicprograms.boot;

import com.xworkz.basicprograms.programs.BasicOperations;

public class BasicOperationsRunner {

	public static void main(String[] args) {
		int result = BasicOperations.operator('-', 4, 4);
		System.out.println(result);
		int add = BasicOperations.operator('+', 4, 4);
		System.out.println(add);
		int multi = BasicOperations.operator('*', 4, 4);
		System.out.println(multi);
		int div = BasicOperations.operator('/', 4, 4);
		System.out.println(div);

	}

}
