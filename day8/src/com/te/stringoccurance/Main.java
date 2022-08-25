package com.te.stringoccurance;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your first string:: ");
		String string1 = scanner.next();
		System.out.println("enter your second string:: ");
		String string2 = scanner.next();
		System.out.println(UserMainCode.getSubstring(string1, string2));
	}
}
