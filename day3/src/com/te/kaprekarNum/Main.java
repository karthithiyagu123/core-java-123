package com.te.kaprekarNum;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer number:: ");
		int number = scanner.nextInt();
		if (number <= 0) {
			System.out.println("please enter positive integer");
		} else {
			if (UserMainCode.getKaprekarNumber(number) == 1) {
				System.out.println("Kaprekar Number");
			} else {
				System.out.println("Not A Kaprekar Number");
			}
		}
		scanner.close();

	}
}
