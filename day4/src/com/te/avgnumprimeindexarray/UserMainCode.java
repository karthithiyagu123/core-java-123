package com.te.avgnumprimeindexarray;

import java.text.DecimalFormat;

public class UserMainCode {
	public static double averageElements(int b, int[] a) {
		int count = 0;
		int count1 = 0;
		int sum = 0;
		double average = 0;
		for (int i = 2; i < b; i++) {
			count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				sum += a[i];
				count1++;
			}
		}
		average = (double)sum / count1;
		DecimalFormat df = new DecimalFormat("#.00");
		double average1 = Double.parseDouble(df.format(average));
		return average1;
		}
}