package com.Oop.org;

import java.util.Scanner;

public class ForLoop4 {
	public static void main(String[] args)
	{
		System.out.println("Enter number: ");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		for(int i=x;i>=0;i--)
		{
			System.out.println(i);
		}
		scan.close();
	}

}
