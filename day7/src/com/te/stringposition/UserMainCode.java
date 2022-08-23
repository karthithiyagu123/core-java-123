package com.te.stringposition;

import java.util.Arrays;
import java.util.Collections;

public class UserMainCode {
	public static int getElementPosition(String[] s1, String s2) {
		Arrays.sort(s1, Collections.reverseOrder());
		int i = 0;
		for (i = 0; i < s1.length; i++) {
			if (s1[i].equals(s2)) {
				i++;
				break;
			}
		}
		return i;
	}

}
