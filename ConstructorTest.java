package com.Oop.org;

public class ConstructorTest {
	int a=20;
	public ConstructorTest()
	{
		this.a=a;
	}
	public ConstructorTest(int a)
	{
		this.a=a;
	}
	public static void main(String[] args)
	{
		ConstructorTest c = new ConstructorTest();
		System.out.println(c.a);
		ConstructorTest c1 = new ConstructorTest(55);
		System.out.println(c1.a);
	}
}
