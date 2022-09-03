package com.te.arraylistassign;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list1 = new ArrayList<Integer>();
		System.out.println("Enter the values of first array list :");
		for (int i = 0; i < 5; i++) {
              list.add(scanner.nextInt());
		}
		System.out.println("Enter the values of second array list :");
		for (int i = 0; i < 5; i++) {
            list1.add(scanner.nextInt());
		}
		
		for (Integer integer : UserMainCode.sortMergedArrayList(list,list1)) {
			System.out.println(integer);
		}
	}
}
