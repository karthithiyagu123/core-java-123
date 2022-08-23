package com.te.firstlastchar;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your sentence : ");
		String string1 = scanner.nextLine();
		if(UserMainCode.checkCharacters(string1)==1) {
			System.out.println("Valid");
		}else {
			System.out.println("Invalid");
		}
}
}