package com.test.org;

import java.util.Scanner;

public class ForLoopTest2 {
	public static void main(String[] args)
	{
		System.out.println("Enter number:");
		Scanner scan = new Scanner(System.in);
		int x  = scan.nextInt();
		for(int i=0;i<x;i++)
		{
			if(i==5)
			{
				break;
			}
			System.out.println(i);
		}
		scan.close();
	}

}
