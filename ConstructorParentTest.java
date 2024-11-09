package com.test.org;

public class ConstructorParentTest {
	int a;
	public ConstructorParentTest()
	{
		this.a=10;
		System.out.println(this.a);
	}
	public ConstructorParentTest(int a)
	{
		this.a=a;
		System.out.println(this.a);
	}
}
