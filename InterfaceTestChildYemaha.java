package com.test.org;

public class InterfaceTestChildYemaha implements InterfaceTestParentBike{

	@Override
	public void speed() {
		System.out.println("20 kmph");
		
	}

	@Override
	public void milage() {
		System.out.println("30");
		
	}

	@Override
	public void gear() {
	System.out.println("Auto");
		
	}
	public static void main(String[] args)
	{
		InterfaceTestChildYemaha i1 = new InterfaceTestChildYemaha();
		i1.speed();
		i1.milage();
		i1.gear();
		
	}
	

}
