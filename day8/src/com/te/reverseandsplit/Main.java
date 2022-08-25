package com.te.reverseandsplit;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your string value :: ");
		String string1 = scanner.nextLine();
		System.out.println("enter your character:: ");
		char char1 = scanner.next().charAt(0);
		System.out.println(UserMainCode.reshape(string1, char1));
	}
}
