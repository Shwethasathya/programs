package com.xworkz.basicprograms.programs;

public class EvenInArray {

	public static void main(String[] args) {
		int array[] = { 1, 2, 4, 7,982,829 };
		System.out.println("print odd numbers");
		for (int i = 0; i < array.length; i++) {

			if (array[i] % 2 != 0) {
				System.out.println(array[i]);
			}
		}
		System.out.println("printing even numbers");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				System.out.println(array[i]);
			}

		}
	}
}