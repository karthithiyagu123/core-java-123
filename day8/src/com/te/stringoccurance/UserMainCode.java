package com.te.stringoccurance;

public class UserMainCode {
	public static int getSubstring(String s1, String s2) {
		int j = 0;
		int count = 0;
		for (int i = 0; i < s1.length(); i++) {
			j = 0;
			if (s1.charAt(i) == s2.charAt(j) && s1.charAt(i + 1) == s2.charAt(j + 1)
					&& s1.charAt(i + 2) == s2.charAt(j + 2)) {
				count++;
			}
		}
		return count;
	}
}
