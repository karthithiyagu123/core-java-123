package com.te.uniqueelements;

import java.util.ArrayList;
import java.util.List;

public class UserMainCode {
	public static int[] arrayListSubtractor(List<Integer> list, List<Integer> list1) {
		List<Integer> first = new ArrayList<Integer>(list);
		first.removeAll(list1);
		List<Integer> second = new ArrayList<Integer>(list1);
		second.removeAll(list);
		first.addAll(second);

		int[] numarray = new int[first.size()];
		Object[] array = first.toArray();
		for (int i = 0; i < array.length; i++) {
			numarray[i] = (int) array[i];
		}
		return numarray;
	}
}
