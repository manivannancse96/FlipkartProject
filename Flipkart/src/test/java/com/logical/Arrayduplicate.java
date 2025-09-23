package com.logical;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Arrayduplicate {

	public static void main(String[] args) {

		int a[] = new int[7];
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 200;
		a[4] = 400;
		a[5] = 500;
		a[6] = 200;

		int length = a.length;
		Set<Integer> lk = new LinkedHashSet();

		for (int i = 0; i < a.length; i++) {

			lk.add(a[i]);

		}
		for (Integer x : lk) {
			
			System.out.println(x);
			
		}
		

	}

}
