package com.te.playwithstring;

public class UserMainCode {
	public static String formString(String[] a1, int n1) {
		StringBuffer s1 = new StringBuffer();
		for (int i = 0; i < a1.length; i++) {
			int j = n1 - 1;
			if (a1[i].length() >= n1) {
				s1.append(a1[i].charAt(j));
			} else {
				s1.append('$');
			}
		}
		String s2 = s1.toString();
		return s2;
	}
}
