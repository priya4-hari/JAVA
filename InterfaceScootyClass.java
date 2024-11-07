package com.testing.org;

public class InterfaceScootyClass implements InterfaceParentClass{

	public static void main(String[] args)
	{
		InterfaceScootyClass is = new InterfaceScootyClass();
		is.speed();
		is.milage();
		is.gear();
	}
	@Override
	public void speed() {
		System.out.println("30 kmph");
		
	}

	@Override
	public void milage() {
		System.out.println("20");
		
	}

	@Override
	public void gear() {
		System.out.println("Auto");
		
	}

}
