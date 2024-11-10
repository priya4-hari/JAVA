package com.test.org;

public class InterfaceTestChildHeroHonda implements InterfaceTestParentBike{

	@Override
	public void speed() {
		System.out.println("50 kmph");
		
	}

	@Override
	public void milage() {
		System.out.println("40");
		
	}

	@Override
	public void gear() {
		System.out.println("AUto");
		
	}
	public static void main(String[] args)
	{
		InterfaceTestChildHeroHonda i1 = new InterfaceTestChildHeroHonda();
		i1.speed();
		i1.milage();
		i1.gear();
		
	}

}
