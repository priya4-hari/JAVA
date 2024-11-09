package com.test.org;

import java.util.Scanner;

public class CountWordString {
	public static void main(String[] args)
	{
		System.out.println("Enter string:");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] arr = str.split(" ");
		System.out.println(arr.length);
		scan.close();
	}

}
