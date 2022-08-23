package com.te.deleteevenvowel;

public class UserMainCode {
	public static String removeEvenVowels(String s1) {
		StringBuffer s2 = new StringBuffer(s1.toLowerCase());
		for (int i = 1; i < s2.length(); i = i + 2) {
			if (s2.charAt(i) == 'a' || s2.charAt(i) == 'e' || s2.charAt(i) == 'i' || s2.charAt(i) == 'o'
					|| s2.charAt(i) == 'u') {
				s2.deleteCharAt(i);
				i--;
			}
		}
		String s3 = s2.toString();
		return s3;
	}
}
