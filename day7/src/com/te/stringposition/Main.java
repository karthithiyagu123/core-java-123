package com.te.stringposition;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your string value :: ");
		String string1 = scanner.nextLine();
		String[] array1=string1.split(",");
		System.out.println("enter your string variable:: ");
		String string2 = scanner.next();
		System.out.println(UserMainCode.getElementPosition(array1,string2));
}
}