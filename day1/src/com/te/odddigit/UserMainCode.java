package com.te.odddigit;

public class UserMainCode {
	public static int checkSum(int n) {
		int b = 0;
		int sum = 0;
		while (n > 0) {
			b=n%10;
			if (b % 2 != 0) {
				sum += b;
			}
			n /= 10;
		}
		if (sum % 2 != 0)
			return 1;

		return -1;
	}
}

	

