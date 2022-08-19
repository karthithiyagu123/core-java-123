package com.te.palindrome;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the lower range:: ");
	int low = scanner.nextInt();
	System.out.println("Enter the higher range:: ");
	int high = scanner.nextInt();
	UserMainCode.addPalindromes(low, high);
	scanner.close();
}
}
