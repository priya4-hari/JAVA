package com.testing.org;

public class ObjectClass {
	
	int x=10;
	public void add()
	{
		System.out.println(10+20);
	}
	public static void main(String[] args)
	{
		ObjectClass o = new ObjectClass();
		System.out.println(o.x);
		o.add();
	}

}
