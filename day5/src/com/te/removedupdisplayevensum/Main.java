package com.te.removedupdisplayevensum;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of an Array:: ");
		int size = scanner.nextInt();
		int[] array1 = new int[size];
		System.out.println("enter array elements :");
		for (int i = 0; i < array1.length; i++) {
			array1[i] = scanner.nextInt();
		}
		System.out.println(UserMainCode.sumElements (array1));
	}
}
