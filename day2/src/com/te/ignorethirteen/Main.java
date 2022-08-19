package com.te.ignorethirteen;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first integer value:: ");
		int num1 = scanner.nextInt();
		System.out.println("Enter second integer value:: ");
		int num2 = scanner.nextInt();
		System.out.println("Enter third integer value:: ");
		int num3 = scanner.nextInt();

		System.out.println(UserMainCode.getLuckySum(num1, num2, num3));
		scanner.close();
	}
}
