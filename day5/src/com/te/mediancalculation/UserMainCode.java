package com.te.mediancalculation;

import java.util.Arrays;

public class UserMainCode {
	public static int calculateMedian (int[] a) {
		Arrays.sort(a);
		int median=0;
		int firstmid=0;
		int secondmid=0;
		float average=0;
		if((a.length%2)!=0) {
			firstmid=a.length/2;
			median=a[firstmid];
		}
		else {
			firstmid=(a.length/2)-1;
			secondmid=(a.length/2);
			average=(float)(a[firstmid]+a[secondmid])/2;
			median=Math.round(average);
		}
		return median;
	}

}
