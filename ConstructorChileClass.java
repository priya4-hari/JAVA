package com.Oop.org;

public class ConstructorChileClass extends ConstructorParentClass{
	int a=50;
	public ConstructorChileClass()
	{
		this.a=a;
		System.out.println(this.a);
		System.out.println(super.a);
		
	}
	public ConstructorChileClass(int a)
	{
		super(60);
		this.a=a;
		System.out.println(this.a);
	}
	public static void main(String[] args)
	{
		ConstructorChileClass c1= new ConstructorChileClass();
		ConstructorChileClass c2 = new ConstructorChileClass(300);
	}

}
