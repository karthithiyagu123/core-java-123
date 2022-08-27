package com.te.asteriskcharacter;

public class UserMainCode {
	public static boolean scanStarNeighbors(String[] s1) {
		String s2 = s1[0].substring((s1[0].length() - 1));
		String s3 = s1[1].substring(0,1);
		if (s2.equalsIgnoreCase(s3)) {
			return true;
		} else {
			return false;
		}
	}

}
