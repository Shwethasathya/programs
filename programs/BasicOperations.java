package com.xworkz.basicprograms.programs;

public class BasicOperations {

	public static int operator(char operator, int val1, int val2) {

		if (operator == '+') {
			return val1+val2;
		}
		if (operator == '-') {
			return val1-val2;
		}
		if (operator == '*') {
			return val1*val2;
		}
		if (operator == '/') {
			return val1/val2;
		}
	return 0;	
	}
}