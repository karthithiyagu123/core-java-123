package com.te.playwithstring;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your first string:: ");
		String string1 = scanner.nextLine();
		String[] array1 = string1.split(",");
		System.out.println("enter your integer value:: ");
		int number1 = scanner.nextInt();
		System.out.println(UserMainCode.formString(array1, number1));
	}
}
