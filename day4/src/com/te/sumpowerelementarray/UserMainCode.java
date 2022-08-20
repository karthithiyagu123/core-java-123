package com.te.sumpowerelementarray;

public class UserMainCode {
	public static int getSumOfPower(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += (int) (Math.pow(a[i], i));
		}
		return sum;
	}

}
