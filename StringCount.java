package com.Oop.org;

import java.util.Scanner;

public class StringCount {
	public static void main(String[] args)
	{
		System.out.println("Enter string:");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] s = str.split(" ");
		System.out.println(s.length);
		scan.close();
	}

}
