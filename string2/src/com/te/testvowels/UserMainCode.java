package com.te.testvowels;

public class UserMainCode {
	public static int testVowels(String s1) {
		int count = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o'
					|| s1.charAt(i) == 'u') {
				count++;
			}
		}
		if (count == 5) {
			return 1;
		} else {
			return 2;
		}
	}

}
