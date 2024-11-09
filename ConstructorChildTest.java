package com.test.org;


public class ConstructorChildTest extends ConstructorParentTest{
	int a;
	public ConstructorChildTest()
	{
		this.a=50;
		System.out.println(this.a);
		System.out.println(super.a);
		
		
	}
	public ConstructorChildTest(int a)
	{
		super(55);
		this.a=a;
		System.out.println(this.a);
	}
	public static void main(String[] args)
	{
		ConstructorChildTest c1 = new ConstructorChildTest();
		ConstructorChildTest c2 = new ConstructorChildTest(100);
	}
}
