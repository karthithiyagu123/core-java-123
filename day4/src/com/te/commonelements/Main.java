package com.te.commonelements;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of an Array:: ");
		int size = scanner.nextInt();
		int[] Array1 = new int[size];
		System.out.println("enter array 1 elements :");
		for (int i = 0; i < Array1.length; i++) {
			Array1[i] = scanner.nextInt();
		}
		int[] Array2 = new int[size];
		System.out.println("enter array 2 elements :");
		for (int i = 0; i < Array2.length; i++) {
			Array2[i] = scanner.nextInt();
		}
		System.out.println(UserMainCode.sumCommonElements(Array1,Array2));
		
	
	}

}
