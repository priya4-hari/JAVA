package com.test.org;

public class EncapsulationTestParent {
	private int productId=1234;
	public void setter(int productId)
	{
		this.productId=productId;
	}
	public int getter()
	{
		return productId;
	}
}
