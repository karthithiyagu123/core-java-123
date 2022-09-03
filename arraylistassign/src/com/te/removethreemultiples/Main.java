package com.te.removethreemultiples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		System.out.println("enter the size of an arraylist");
		Integer integer = scanner.nextInt();

		System.out.println("Enter the values of array list :");
		for (int i = 0; i < integer; i++) {
			list.add(scanner.nextInt());
		}
		List<Integer> list2 = UserMainCode.removeMultiplesOfThree(list);
		for (Integer integer2 : list2) {
			System.out.println(integer2);
		}
		scanner.close();
	}

}
