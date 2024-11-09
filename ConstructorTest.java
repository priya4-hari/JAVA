package com.test.org;

public class ConstructorTest {
	int a;
	public ConstructorTest()
	{
		this.a=10;
	}
	public ConstructorTest(int a)
	{
		this.a=a;
	}
	public static void main(String[] args)
	{
		ConstructorTest c1 = new ConstructorTest();
		System.out.println(c1.a);
		ConstructorTest c2 = new ConstructorTest(50);
		System.out.println(c2.a);
	}

}
