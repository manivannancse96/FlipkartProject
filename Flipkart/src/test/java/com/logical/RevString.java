package com.logical;

public class RevString {

	public static void main(String[] args) {

		String s = "Java Application";
		String rev = "";

		int li = s.length();
		for (int i = li - 1; i >= 0; i--) {

			rev = rev + s.charAt(i);

		}
		System.out.println(rev);

	}

}
