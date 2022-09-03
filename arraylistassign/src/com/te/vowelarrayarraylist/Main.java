package com.te.vowelarrayarraylist;

import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size of an array");
		String[] array = new String[scanner.nextInt()];
		System.out.println("enter the string elements of array");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.next();
		}
		List<String> list = UserMainCode.matchCharacter(array);
		for (String string : list) {
			System.out.println(string);
		}
		scanner.close();
	}

}
