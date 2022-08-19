package com.te.digitseven;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer number:: ");
		int n = scanner.nextInt();
		if (n < 0) {
			System.out.println("please enter non negative integer");
		} else {
			System.out.println(UserMainCode.countSeven(n));
		}
		scanner.close();
	}
}
