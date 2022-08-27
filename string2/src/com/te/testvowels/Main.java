package com.te.testvowels;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your string:: ");
		String string1 = scanner.next();
		if (UserMainCode.testVowels(string1) == 1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}