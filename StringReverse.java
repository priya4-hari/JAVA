package com.test.org;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args)
	{
		System.out.println("Enter string:");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(sb.toString());
	}

}
