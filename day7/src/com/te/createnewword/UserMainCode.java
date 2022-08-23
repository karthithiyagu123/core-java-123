package com.te.createnewword;

public class UserMainCode {
public static String formNewWord(int n1,String s1) {
	String s2=s1.substring(0, n1);
	String s3=s1.substring(s1.length()-n1);
	StringBuffer s4=new StringBuffer();
	s4=s4.append(s2).append(s3);
	String s5=s4.toString();
	return s5;
}
}
