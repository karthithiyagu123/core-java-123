package com.te.removedupdisplayevensum;

public class UserMainCode {
	public static int sumElements(int[] a) {
		int count = 0;
		int sum = 0;

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					a[j] = 0;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0)
				sum += a[i];
		}
		return sum;
	}

}
