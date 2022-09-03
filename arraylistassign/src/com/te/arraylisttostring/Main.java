package com.te.arraylisttostring;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<String> list = new ArrayList();
		System.out.println("enter the size of an arraylist");
		Integer size = scanner.nextInt();
		System.out.println("Enter the values of array list :");
		for (int i = 0; i < size; i++) {
			list.add(scanner.next());
		}
		String[] array = UserMainCode.convertToStringArray(list);
		for (String string : array) {
			System.out.println(string);
		}
	}

}
