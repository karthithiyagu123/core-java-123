package com.te.evenoddindexsum;

public class UserMainCode {
public static int sumOfOddEvenPositioned(int num1) {
	int temp1=num1;
	int count=0;
	int oddSum=0;
	int evenSum=0;
	while(num1>0) {
		num1/=10;
		count++;
	}
	while(temp1>0) {
		if(count%2==0) {
			oddSum+=temp1%10;
		}
		else {
			evenSum+=temp1%10;
		}
		temp1/=10;
		count--;
	}
	if(oddSum==evenSum)
		return 1;
	else
		return -1;
}
}
