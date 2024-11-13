package com.test.org;

public class StringBuilderTest {
	public static void main(String[] args)
	{
		String s="Hello";
		StringBuilder sb = new StringBuilder(s);
		sb.append(" World");
		System.out.println(sb.toString());
	}

}
