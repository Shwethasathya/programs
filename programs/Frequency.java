//Program to find the frequency of a given character in a string

package com.xworkz.basicprograms.programs;

public class Frequency {

	public static void main(String[] args) {
		String str = "Software trainee at x-workz 5218100899";
		char ch = 'a';
		int frequency = 0;

		for (int i = 0; i < str.length(); i++) {
			if (ch == str.charAt(i)) {

				frequency++;

			}

		}
		System.out.println("frequency of " + ch + "=" + frequency);
	}

}
