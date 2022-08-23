package com.te.stringprograms;

public class UserMainCode {
	public static String getMiddleChars(String s1) {
		int i = s1.length() / 2 - 1;
		int j = i + 1;
		StringBuffer s2=new StringBuffer();
		s2=s2.append(s1.charAt(i)).append(s1.charAt(j));
		String s3=s2.toString();
		return s3;
	}

}
