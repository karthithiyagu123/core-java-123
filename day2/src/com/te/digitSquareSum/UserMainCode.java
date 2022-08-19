package com.te.digitSquareSum;

public class UserMainCode {
	public static int getSumOfSquaresOfDigits(int n) {
		int sum = 0;
		int b;
		while (n > 0) {
			b = n % 10;
			sum += b * b;
			n /= 10;
		}
		return sum;
	}
}
