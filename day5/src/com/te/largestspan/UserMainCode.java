package com.te.largestspan;

public class UserMainCode {
	public static int getLargestSpan(int[] a) {
		int indexgap = 0;
		int large = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					indexgap = j - i;
				}
			}
			if (indexgap > large) {
				large = indexgap;
			}
		}
		return large + 1;
	}

}
