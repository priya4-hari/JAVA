package com.Oop.org;

public class EncapsuleChildTest extends EncapsuleParentTest{
	public static void main(String[] args)
	{
		EncapsuleChildTest c = new EncapsuleChildTest();
		c.setter(56789);
		System.out.println(c.getter());
	}

}
