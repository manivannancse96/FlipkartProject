package com.logical;

public class NumofWords {
	
	public static void main(String[] args) {
		
		String  a = "Welcome to java selenium course";
String[] sp = a.split(" ");
int li = sp.length;
System.out.println(li);
for (int i = 0; i < sp.length; i++) {
	
	System.out.println(sp[i]);
	
}	

	}

}
