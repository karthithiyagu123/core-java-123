package com.te.diffofelements;

import java.util.Arrays;

public class UserMainCode {
	public static int getBigDiff(int[] a) {
		int b = 0;
		if (a.length == 1) {
			b = a[0];
		} else {
			Arrays.sort(a);
			b = a[a.length - 1] - a[0];
		}
		return b;
	}
}