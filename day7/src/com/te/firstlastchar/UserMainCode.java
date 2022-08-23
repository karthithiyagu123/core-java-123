package com.te.firstlastchar;

public class UserMainCode {
	public static int checkCharacters(String s1) {
		if (s1.charAt(0) == (s1.charAt(s1.length() - 1)))
			return 1;
		else
			return -1;
	}
}
