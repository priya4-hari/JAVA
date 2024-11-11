package com.testing.org;

public class AbstractScootyBike extends AbstractParentClass{

	public static void main(String[] args)
	{
		AbstractScootyBike as = new AbstractScootyBike();
		as.speed();
		as.milage();
		as.gear();
	}
	@Override
	void speed() {
		System.out.println("50 Kmph");
		
	}

	@Override
	void milage() {
		System.out.println("30");
		
	}

}
