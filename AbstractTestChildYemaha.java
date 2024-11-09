package com.test.org;

public class AbstractTestChildYemaha extends AbstractTestParentBikes{

	@Override
	void speed() {
		System.out.println("20 kmph");
		
	}

	@Override
	void milage() {
		System.out.println("50");
		
	}
	
	public static void main(String[] args)
	{
		AbstractTestChildYemaha a1 = new AbstractTestChildYemaha();
		a1.speed();
		a1.milage();
		a1.gear();
	}

}
