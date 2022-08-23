package com.te.deleteevenvowel;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your string value :: ");
		String string1 = scanner.next();
		System.out.println(UserMainCode.removeEvenVowels(string1));
	}
}