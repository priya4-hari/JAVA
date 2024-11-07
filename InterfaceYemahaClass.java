package com.testing.org;

public class InterfaceYemahaClass implements InterfaceParentClass{

	public static void main(String[] args)
	{
		InterfaceYemahaClass iy = new InterfaceYemahaClass();
		iy.speed();
		iy.milage();
		iy.gear();
	}
	@Override
	public void speed() {
	System.out.println("20 kmph");
		
	}

	@Override
	public void milage() {
		System.out.println("60");
		
	}

	@Override
	public void gear() {
	System.out.println("Auto");
		
	}

}
