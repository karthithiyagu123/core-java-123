package com.te.reverseandsplit;

public class UserMainCode {
	public static String reshape(String s1, char ch) {
		String s2 = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			s2 = s2 + s1.charAt(i) + ch;
		}
		return s2;
	}
}
