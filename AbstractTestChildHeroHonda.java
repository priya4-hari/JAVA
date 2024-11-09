package com.test.org;

public class AbstractTestChildHeroHonda extends AbstractTestParentBikes{

	@Override
	void speed() {
		System.out.println("50 kmph");
		
	}

	@Override
	void milage() {
		System.out.println("70");
		
	}
	public static void main(String[] args)
	{
		AbstractTestChildHeroHonda a2 = new AbstractTestChildHeroHonda();
		a2.speed();
		a2.milage();
		a2.gear();
	}

}
