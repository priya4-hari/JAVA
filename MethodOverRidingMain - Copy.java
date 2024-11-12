package com.Oop.org;

public class MethodOverRidingMain {
	public static void main(String[] args)
	{
		MethodOverRidingVersion1 v1 = new MethodOverRidingVersion1();
		v1.speed();
		v1.milage();
		MethodOverRidingVersion2 v2 = new MethodOverRidingVersion2();
		v2.speed();
		v2.milage();
	}

}
