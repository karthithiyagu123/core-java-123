package com.te.boundaryaverage;

import java.util.Arrays;

public class UserMainCode {
	public static float getBoundaryAverage(int[] a) {
		Arrays.sort(a);
		int min=a[0];
		int max=a[a.length-1];
		float average=(float)(min+max)/2;
		return average;
		
	}

}
