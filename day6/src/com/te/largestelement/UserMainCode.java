package com.te.largestelement;

import java.util.Arrays;

public class UserMainCode {
	public static int checkLargestAmongCorner(int[] a) {
		int l = a.length;
		int largest = 0;
		if (l == 1) {
			largest = a[0];
		} else {
			int[] b = new int[3];
			int first = a[0];
			int middle = a[(l + 1) / 2 - 1];
			int last = a[l - 1];

			b[0] = first;
			b[1] = middle;
			b[2] = last;
			Arrays.sort(b);
			largest = b[2];
		}
		return largest;
	}
}
