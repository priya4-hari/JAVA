package com.test.org;

import java.util.Scanner;

public class StringWordCountWithoutMethod {
	
	public static void main(String[] args)
	{
		System.out.println("Enter string:");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int count=0;
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)==' ' && str.charAt(i+1)!=' ')
			{
				count++;
			}
		}
		System.out.println(count+1);
	}

}
