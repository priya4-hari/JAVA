package com.test.org;

import java.util.Scanner;

public class WhileLoopTest3 {
	public static void main(String[] args)
	{
		System.out.println("Enter number:");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		while(x==6)
		{
			System.out.println(x);
		}
		scan.close();
	}

}
