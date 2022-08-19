package com.te.unique;

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
		UserMainCode.getUnique(n);
	}
	
	if(UserMainCode.getUnique(n)==1)
	{
		System.out.println("number is unique");
	}
	else {
		System.out.println("number is not an unique");
	}
	scanner.close();	
}
}
