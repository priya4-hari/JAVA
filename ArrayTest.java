package com.Oop.org;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args)
	{
		System.out.println("Enter number of array ele:");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array ele:");
		for(int i=0;i<n;i++)
		{
			Scanner scan1 = new Scanner(System.in);
			arr[i]=scan1.nextInt();
		}
		System.out.println("Array Elements are:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
