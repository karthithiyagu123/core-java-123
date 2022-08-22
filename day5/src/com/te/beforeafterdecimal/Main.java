package com.te.beforeafterdecimal;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter double type number:: ");
		double number = scanner.nextDouble();
		System.out.println(UserMainCode.findNoDigits(number));
	}
}
