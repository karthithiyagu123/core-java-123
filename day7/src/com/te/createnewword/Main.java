package com.te.createnewword;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your number:: ");
		int number = scanner.nextInt();
		System.out.println("enter your string value :: ");
		String string1 = scanner.next();
		if (string1.length() % 2 != 0 || string1.length() < 2 * number) {
			System.out.println("enter valid even length string");
		} else {
			System.out.println(UserMainCode.formNewWord(number,string1));
		}
	}
}
