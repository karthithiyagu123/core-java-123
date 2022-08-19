package com.te.perfectNum;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter an integer number:: ");
	int number = scanner.nextInt();
	if (number <= 0) {
		System.out.println("please enter non negative integer");
	} else {
		System.out.println(UserMainCode.getPerfection(number));
	}
	scanner.close();
}
}
