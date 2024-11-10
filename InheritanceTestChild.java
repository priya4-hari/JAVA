package com.test.org;

public class InheritanceTestChild extends InhertanceTestParent{

	public int sub(int a,int b)
	{
		return (a-b);
	}
	public static void main(String[] args)
	{
		InheritanceTestChild i2 = new InheritanceTestChild();
		System.out.println(i2.sub(500, 400));
		InhertanceTestParent i1 = new InhertanceTestParent();
		System.out.println(i1.productId);
		System.out.println(i1.sum(100, 100));
	}
}
