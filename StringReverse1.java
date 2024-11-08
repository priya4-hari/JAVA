package com.Oop.org;

import java.util.Scanner;

public class StringReverse1 {
	
	public static void main(String[] args)
	{
		System.out.println("Enter string:");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(sb.toString());
		scan.close();
	}

}
