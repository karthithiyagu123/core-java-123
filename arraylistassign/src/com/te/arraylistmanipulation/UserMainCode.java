package com.te.arraylistmanipulation;

import java.util.ArrayList;
import java.util.List;

public class UserMainCode {
	public static List<Integer> generateOddEvenList(List<Integer> list, List<Integer> list1) {
		List<Integer> list2 = new ArrayList(list.size());

		for (int i = 0; i < list1.size(); i += 2) {
			list2.add(list1.get(i));
		}
		for (int i = 1; i < list.size(); i += 2) {
			list2.add(i, list.get(i));
		}
		return list2;
	}

}
