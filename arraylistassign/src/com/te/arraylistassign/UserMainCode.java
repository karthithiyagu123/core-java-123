package com.te.arraylistassign;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserMainCode {
	public static List<Integer> sortMergedArrayList(List<Integer> list, List<Integer> list1) {
		list.addAll(list1);
		Collections.sort(list);
		List<Integer> list2 = new ArrayList();
		list2.add(list.get(2));
		list2.add(list.get(6));
		list2.add(list.get(8));
		return list2;
	}

}
