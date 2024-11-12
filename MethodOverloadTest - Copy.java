package com.test.org;

public class MethodOverloadTest {
	public int add(int a,int b)
	{
		return (a+b);
	}
	public int add(int a,int b,int c)
	{
		return (a+b+c);
	}
	public double add(double a,double b)
	{
		return (a+b);
	}
	public double add(double a,double b,double c)
	{
		return (a+b+c);
	}
	public static void main(String[] args)
	{
		MethodOverloadTest m = new MethodOverloadTest();
		System.out.println(m.add(100, 100));
		System.out.println(m.add(100, 100, 100));
		System.out.println(m.add(100.00, 100.00));
		System.out.println(m.add(100.0, 100.0, 100.0));
	}

}
