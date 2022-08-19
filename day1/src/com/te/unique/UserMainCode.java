package com.te.unique;

public class UserMainCode {
public static int getUnique(int n) {
	int temp1=n;
	int temp2=n;
	int count=0;
	while(temp1>0){
		int rem1=temp1%10;
		while(temp2>0) {
			int rem2=temp2%10;
			if(rem1==rem2) {
				count++;
			}
			temp2/=10;
		}
		temp1/=10;
	}
	if(count==1) {
		return 1;
	}
	else {
		return -1;
	}
}
}
