package com.te.kaprekarNum;

public class UserMainCode {
	public static int getKaprekarNumber(int number) {
		int square = number * number;
		int temp = square;
		int count = 0;
		int count1 = 0;
		int sum1 = 0;
		int firstPart = 0;
		int reversesecondPart = 0;
		int secondPart = 0;

		while (temp > 0) {
			count++;
			temp /= 10;
		}

		if (count % 2 == 0) {
			count1 = count / 2;
			for (int i = count1; i < count; i++) {
				reversesecondPart = (reversesecondPart * 10) + (square % 10);
				square /= 10;
			}
		} else {
			count1 = (count / 2) + 1;
			for (int i = count1; i <= count; i++) {
				reversesecondPart = (reversesecondPart * 10) + (square % 10);
				square /= 10;
			}
		}

		while (reversesecondPart > 0) {
			secondPart = (secondPart * 10) + (reversesecondPart % 10);
			reversesecondPart /= 10;
		}
		System.out.println(count1);
		firstPart = square;
		if (firstPart == 0 || secondPart == 0) {
			return -1;
		}
		sum1 = firstPart + secondPart;
		if (number == sum1) {
			return 1;
		}
		return -1;
	}
}
