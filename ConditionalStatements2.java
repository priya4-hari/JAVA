package com.test.org;

import java.util.Scanner;

public class ConditionalStatements2 {
	public static void main(String[] args)
	{
		System.out.println("Enter number:");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		switch(x)
		{
		case 5:System.out.println("Entered number is 5");
				break;
		case 10:System.out.println("Entered number is 10");
				break;
		default:System.out.println("Entered number is not 5 or 10");
				break;
		}
		scan.close();
	}

}
