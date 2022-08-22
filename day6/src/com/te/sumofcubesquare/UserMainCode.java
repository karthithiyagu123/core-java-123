package com.te.sumofcubesquare;

public class UserMainCode {
public static int addEvenOdd (int[] a){
	int square=0;
	int cube=0;
	int sum=0;
	for (int i = 0; i < a.length; i++) {
		if(a[i]%2==0) {
			square+=a[i]*a[i];
		}
	}
	for (int j = 0; j < a.length; j++) {
		if(a[j]%2!=0) {
			cube+=a[j]*a[j]*a[j];
		}
	}
	sum=square+cube;
	return sum;
}
}
