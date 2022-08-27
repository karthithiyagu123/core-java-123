package com.te.lastletters;

public class UserMainCode {
public static String getLastLetter (String[] s1) {
	StringBuffer s2= new StringBuffer();
	int j=0;
	for (int i = 0; i < s1.length; i++) {
		j=s1[i].length()-1;
		s2=s2.append(s1[i].toUpperCase().charAt(j)).append('$');
	}
	String s3= s2.deleteCharAt(s2.length()-1).toString();
	return s3;
}
}
