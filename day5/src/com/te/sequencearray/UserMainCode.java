package com.te.sequencearray;

public class UserMainCode {
	public static boolean searchSequence(int[] a) {
		int count=0;
		for (int i = 0; i < a.length; i++){
			if(a[i]==1 && a[i+1]==2) {
				if(a[i+1]==2 && a[i+2]==3){
					count++;
					break;
				}
			}
		}
		if(count==1)
			return true;
		else
			return false;
	}

}
