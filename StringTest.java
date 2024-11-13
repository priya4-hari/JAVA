package com.test.org;

public class StringTest {
	public static void main(String[] args)
	{
		String s = "Hello";
		s.concat(" World!");
		System.out.println(s);
		String str = s.concat(" World!");
		System.out.println(str);
	}

}
