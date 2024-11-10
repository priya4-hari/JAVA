package com.test.org;

public class InhertanceTestParent {
	int productId=1234;
	public int sum(int a,int b)
	{
		return (a+b);
	}
	public static void main(String[] args)
	{
		InhertanceTestParent i1 = new InhertanceTestParent();
		System.out.println(i1.productId);
		System.out.println(i1.sum(100, 200));
	}

}
