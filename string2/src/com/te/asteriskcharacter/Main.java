package com.te.asteriskcharacter;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your first string:: ");
		String string1 = scanner.nextLine();
		String[] array1 = string1.split("\\*");
		System.out.println(UserMainCode.scanStarNeighbors(array1));
	}
}
