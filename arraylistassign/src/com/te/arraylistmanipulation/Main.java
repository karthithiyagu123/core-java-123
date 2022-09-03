package com.te.arraylistmanipulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Integer> list = new ArrayList();
		List<Integer> list1 = new ArrayList();
		System.out.println("enter the size of an arraylist");
		Integer integer = scanner.nextInt();

		System.out.println("Enter the values of first array list :");
		for (int i = 0; i < integer; i++) {
			list.add(scanner.nextInt());
		}
		System.out.println("Enter the values of second array list :");
		for (int i = 0; i < integer; i++) {
			list1.add(scanner.nextInt());
		}
		List<Integer> list3 = UserMainCode.generateOddEvenList(list, list1);
		for (Integer integer2 : list3) {
			System.out.println(integer2);
		}
	}

}
