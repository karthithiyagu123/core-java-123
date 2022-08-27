package com.te.repeatfront;

public class UserMainCode {
	public static String repeatFirstThreeCharacters(String s1, int n1) {
		String s2 = "";
		String s4 = "";
		if (s1.length() >= 3) {
			for (int i = 0; i < 3; i++) {
				s2 = s2 + s1.charAt(i);
			}
		} else {
			for (int i = 0; i < s1.length(); i++) {
				s2 = s2 + s1.charAt(i);
			}
		}
		StringBuffer s3 = new StringBuffer();
		for (int i = 0; i < n1; i++) {
			s3.append(s2);
		}
		s4 = s3.toString();
		return s4;
	}
}
