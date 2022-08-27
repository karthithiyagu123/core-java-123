package com.te.repeatfront;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your first string:: ");
		String string1 = scanner.next();
		System.out.println("enter your integer value:: ");
		int number1 = scanner.nextInt();
		if (number1 <= 0) {
			System.out.println("please enter positive integer");
		} else {
			System.out.println(UserMainCode.repeatFirstThreeCharacters(string1, number1));
		}
	}
}
