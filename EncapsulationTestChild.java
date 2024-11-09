package com.test.org;

public class EncapsulationTestChild extends EncapsulationTestParent{
	public static void main(String[] args)
	{
		EncapsulationTestChild e = new EncapsulationTestChild();
		e.setter(5678);;
		System.out.println(e.getter());
	}

}
