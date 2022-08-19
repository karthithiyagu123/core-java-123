package com.te.perfectNum;

public class UserMainCode {
	public static boolean getPerfection(int number) {
		int sum = 0;
		for (int digit = 1; digit < number; digit++) {
			if (number % digit == 0)
				sum += digit;
		}
		if (sum == number)
			return true;

		return false;
	}
}
