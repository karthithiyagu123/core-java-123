package com.te.odddigit;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer number:: ");
		int n = scanner.nextInt();
		if (n <= 0) {
			System.out.println("please enter positive integer");
			return;
		} else {
			UserMainCode.checkSum(n);
		}
		
		if (UserMainCode.checkSum(n) == 1) {
			System.out.println("sum of odd digits is odd");
		} else {
			System.out.println("sum of odd digits is even");
		}
		scanner.close();
	}
}