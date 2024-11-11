package com.test.org;

import java.util.Scanner;

public class SwappingString {
	public static void main(String[] args)
	{
		System.out.println("Enter first String:");
		Scanner scan1 = new Scanner(System.in);
		String str1 = scan1.nextLine();
		System.out.println("Enter second String:");
		Scanner scan2 = new Scanner(System.in);
		String str2 = scan2.nextLine();
		String t="";
		t=str1;
		str1=str2;
		str2=t;
		System.out.println("str1:"+str1);
		System.out.println("str2:"+str2);
	}

}
