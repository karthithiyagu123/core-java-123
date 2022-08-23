package com.te.stringprograms;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your string value : ");
		String string1 = scanner.next();
		if (string1.length() % 2 != 0) {
			System.out.println("enter even length string");
		} else {
			System.out.println(UserMainCode.getMiddleChars(string1));
		}
	}
}
