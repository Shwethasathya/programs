package com.xworkz.programs;

public class Square {

	public static void main(String[] args) {

		System.out.println("printing triangle");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 6 - i; j++) {
				System.out.print(j + " ");
			}

			System.out.println(" ");

		}
	}
}
