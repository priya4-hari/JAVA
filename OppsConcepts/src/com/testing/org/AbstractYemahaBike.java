package com.testing.org;

public class AbstractYemahaBike extends AbstractParentClass{

	public static void main(String[] args)
	{
		AbstractYemahaBike ay = new AbstractYemahaBike();
		ay.speed();
		ay.milage();
		ay.gear();
	}
	@Override
	void speed() {
		System.out.println("20 kmph");
		
	}

	@Override
	void milage() {
	System.out.println("100");
		
	}
	

}
