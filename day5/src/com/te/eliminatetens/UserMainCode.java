package com.te.eliminatetens;

public class UserMainCode {
	public static int[] removeTens(int a, int[] b) {
		int count = 0;
		int j = 0;
		for (int i = 0; i < a; i++) {
			if (b[i] == 10) {
				count++;
				j = i;
				while (j < a - count) {
					b[j] = b[j + 1];
					j++;
				}
				i--;
			}
		}
		for (int k = a - 1; k >= a - count; k--) {
			b[k] = 0;
		}
		return b;
	}
}
