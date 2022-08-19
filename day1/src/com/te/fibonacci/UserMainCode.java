package com.te.fibonacci;

public class UserMainCode {
	public static int getSumOfNfibos(int n) {
		if (n == 1)
			return 0;
		else if (n == 2 || n == 3)
			return 1;
		else
			return getSumOfNfibos(n - 1) + getSumOfNfibos(n - 2);
	}
}