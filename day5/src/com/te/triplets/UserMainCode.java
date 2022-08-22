package com.te.triplets;

public class UserMainCode {
	public static boolean checkTripplets(int[] a) {
		int count = 0;
		for (int i = 0; i < a.length - 2 ; i++) {
			if (a[i] == a[i + 1]) {
				if (a[i + 1] == a[i + 2]) {
					count++;
					break;
				}
			}
		}
		if (count == 1)
			return true;
		else
			return false;
	}

}
