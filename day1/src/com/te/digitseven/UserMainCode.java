package com.te.digitseven;

public class UserMainCode {
	public static int countSeven(int n) {
		int count = 0;
		while (n > 0) {
			if (n % 10 == 7) {
				count++;
				}
			n/=10;
		}
		return count;
	}
}
