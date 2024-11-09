package com.test.org;

import java.util.Scanner;

public class ForLoppTest4 {
	public static void main(String[] args)
	{
		System.out.println("Enter number:");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		for(int i=x;i>=0;i--)
		{
			System.out.println(i);
		}
		scan.close();
	}

}
