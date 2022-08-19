package com.te.palindrome;

public class UserMainCode {
	public static int addPalindromes(int low,int high) {
		int add=0;
		int temp;
		int sum;
		
		for (int i = low; i <= high; i++) {
			temp = i;
			sum = 0;
			while (i > 0) {
				sum = (sum * 10) + (i % 10);
				i /= 10;
			}
			if (temp == sum) {
				add += temp;
			}
		}
		System.out.println("palindrome");
		System.out.println("add :"+add);
		return add;
	}
}
