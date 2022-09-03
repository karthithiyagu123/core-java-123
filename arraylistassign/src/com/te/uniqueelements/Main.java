package com.te.uniqueelements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list1 = new ArrayList<Integer>();
		System.out.println("enter the size of first arraylist");
		Integer size1 = scanner.nextInt();

		System.out.println("Enter the values of first array list :");
		for (int i = 0; i < size1; i++) {
			list.add(scanner.nextInt());
		}
		System.out.println("enter the size of second arraylist");
		Integer size2 = scanner.nextInt();

		System.out.println("Enter the values of second array list :");
		for (int i = 0; i < size2; i++) {
			list1.add(scanner.nextInt());
		}
		int[] array=UserMainCode.arrayListSubtractor(list, list1);
		Arrays.sort(array);
		for (int i : array) {
			System.out.println(i);
		}
	}

}
