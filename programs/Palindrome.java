package com.xworkz.programs;

public class Palindrome {

	public static void main(String[] args) {

		int n = 7411944092, reverse = 0, rem, temp;

		temp = n;
		while (temp != 0) {
			rem = temp % 10;
			reverse = reverse * 10 + rem;
			temp /= 10;
		}
		;

		if (n == reverse)
			System.out.println(n + " is Palindrome");
		else
			System.out.println(n + " is not Palindrome");

	}
}
