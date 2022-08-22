package com.te.addthenreverse;

public class UserMainCode {
	public static int addAndReverse(int n,int[] b) {
		int sum=0;
		int reverse=0;
		for (int i = 0; i < b.length; i++) {
			if(b[i]>n) {
				sum+=b[i];
			}
		}
	  while(sum>0) {
		  reverse=reverse*10+sum%10;
		  sum/=10;
	  }
	  return reverse;
	}

}
