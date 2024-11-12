package com.Oop.org;

public class MethodOverloadingTest {
	public int add(int a,int b)
	{
		return (a+b);
	}
	public double add(double a,double b)
	{
		return (a+b);
	}
	public int add(int a,int b,int c)
	{
		return (a+b+c);
	}
	public double add(double a,double b,double c)
	{
		return (a+b+c);
	}
	public static void main(String[] args)
	{
		MethodOverloadingTest m = new MethodOverloadingTest();
		System.out.println(m.add(10, 10));
		System.out.println(m.add(10.0, 10.0));
		System.out.println(m.add(10, 10, 10));
		System.out.println(m.add(10.0, 10.0, 10.0));
	}

}
