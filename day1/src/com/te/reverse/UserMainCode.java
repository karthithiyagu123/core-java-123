package com.te.reverse;

public class UserMainCode {
	public static int reverseNumber(int n) {
		int sum = 0;
		while (n > 0) {
			sum = sum * 10 + (n % 10);
			n /= 10;
		}
		return sum;
	}

}
