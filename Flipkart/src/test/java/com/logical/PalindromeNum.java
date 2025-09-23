package com.logical;

public class PalindromeNum {

	public static void main(String[] args) {

		int a = 12321;
		int b = a;
		int rev = 0;

		while (a > 0) {
			int n = a % 10;
			rev = (rev * 10) + n;
			a /= 10;
		}

		if (rev == b) {
			System.out.println("This is a palindrome");
		} else {
			System.out.println("this is not a palindrome");
		}

	}

}
