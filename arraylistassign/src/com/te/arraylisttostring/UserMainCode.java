package com.te.arraylisttostring;

import java.util.Collections;
import java.util.List;

public class UserMainCode {
	public static String[] convertToStringArray(List<String> list) {
		Collections.sort(list);
		String[] array = list.toArray(new String[list.size()]);
		return array;
	}

}
