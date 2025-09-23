package com.logical;

public class Palindromeletter {

	public static void main(String[] args) {


		String str = "MALAYALAM";
		String rev = "";
		
		int l = str.length();
		
		for (int i = l-1; i >=0; i--)
		{
			
			rev = rev+str.charAt(i);
		}
		
		
//		System.out.println(rev);
		
		if (str.equals(rev)) 
			
		{
			System.out.println("palindrome");
			
		}
		else
			
		{
			
			System.out.println("not a palindrome");
			
		}
		
		
		
	}

}
