package com.test.org;

public class ClassObjectTest {
	int a = 10;
	public void add()
	{
		System.out.println(10+10);
	}
	public static void main(String[] args)
	{
		ClassObjectTest c = new ClassObjectTest();
		System.out.println(c.a);
		c.add();
	}

}
