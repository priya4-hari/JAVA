package com.Oop.org;

import java.util.Scanner;

public class ConditionalStatements1 {

	public static void main(String[] args) {
		System.out.println("Enter Number: ");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		if (x == 5) {
			System.out.println("Entered number is 5");
		} else {
			System.out.println("Entered number is not 5");
		}
		scan.close();
	}

}
