package com.test.org;

import java.util.Scanner;

public class DoWhileTest {
	public static void main(String[] args)
	{
		System.out.println("Enter number:");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		do
		{
			System.out.println(x);
			x++;
		}while(x==6);
		scan.close();
	}

}
