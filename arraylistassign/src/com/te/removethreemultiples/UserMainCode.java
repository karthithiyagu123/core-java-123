package com.te.removethreemultiples;

import java.util.List;

public class UserMainCode {
	public static List<Integer> removeMultiplesOfThree(List<Integer> list) {
		for (int i = 2; i < list.size(); i += 3) {
			list.remove(i);
			i--;
		}
		return list;
	}
}