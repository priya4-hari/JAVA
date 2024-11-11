package com.testing.org;

public class InheritanceParentClass {
	int productId=1234;
	public int add(int a,int b)
	{
		return (a+b);
	}
	public static void main(String[] args)
	{
		InheritanceParentClass i1 = new InheritanceParentClass();
		System.out.println(i1.productId);
		System.out.println(i1.add(200, 300));
	}
}
