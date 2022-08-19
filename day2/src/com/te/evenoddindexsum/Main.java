package com.te.evenoddindexsum;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer number:: ");
		int n = scanner.nextInt();
		if (n <= 0) {
			System.out.println("please enter positive integer");
		} else {
			if (UserMainCode.sumOfOddEvenPositioned(n) == 1) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
		scanner.close();

	}
}