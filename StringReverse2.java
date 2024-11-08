package com.Oop.org;

import java.util.Scanner;

public class StringReverse2 {
	public static void main(String[] args)
	{
		System.out.println("Enter String:");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String s = "";
		for(int i=str.length()-1;i>=0;i--)
		{
			s=s+str.charAt(i);
		}
		System.out.println(s);
		scan.close();
	}

}
