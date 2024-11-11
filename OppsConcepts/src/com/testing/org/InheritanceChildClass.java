package com.testing.org;

public class InheritanceChildClass extends InheritanceParentClass{
	public int sub(int a,int b)
	{
		return (a-b);
	}
	public static void main(String[] args)
	{
		InheritanceChildClass i2 = new InheritanceChildClass();
		InheritanceParentClass i3 = new InheritanceParentClass();
		System.out.println(i2.sub(50, 20));
		System.out.println(i3.productId);
		System.out.println(i3.add(200, 300));
	}

}
