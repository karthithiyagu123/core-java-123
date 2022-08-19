package com.te.evendigit;

public class UserMainCode {
	public static int sumOfSquaresOfEvenDigits(int n) {
		int b = 0;
		int sum = 0;
		while (n > 0) {
			b = n % 10;
			if (b % 2 == 0) {
				sum = sum + b * b;
			}
			n = n / 10;
		}
		System.out.println(sum);
		return sum;

	}
}
