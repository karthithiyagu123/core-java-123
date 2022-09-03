package com.te.vowelarrayarraylist;

import java.util.ArrayList;
import java.util.List;

public class UserMainCode {
	public static List<String> matchCharacter(String[] s1) {
		List<String> list = new ArrayList();
		for (int i = 0; i < s1.length; i++) {
			Character ch = s1[i].charAt(0);
			Character ch1 = s1[i].charAt(s1[i].length() - 1);
			if ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
					&& (ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u')) {
                   list.add(s1[i]);
			}
		}
		return list;
	}

}
