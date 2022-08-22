package com.te.beforeafterdecimal;

import java.util.StringTokenizer;

public class UserMainCode {
	public static String findNoDigits(double d) {
		int firstpartlength = 0;
		int secondpartlength = 0;
		String s = String.valueOf(d);
		StringTokenizer stringTokenizer = new StringTokenizer(s, ".");
		String s1 = stringTokenizer.nextToken();
		String s2 = stringTokenizer.nextToken();
		firstpartlength = s1.length();
		secondpartlength = s2.length();
		if (s1.charAt(0) == 0)
			firstpartlength = s1.length() - 1;
		if (secondpartlength != 1)
			if (s2.charAt(s2.length() - 1) == 0)
				secondpartlength = s2.length() - 1;
		String s3 = String.valueOf(firstpartlength) + ":" + String.valueOf(secondpartlength);
		return s3;

	}

}
