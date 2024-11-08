package com.Oop.org;

public class StringBuilderClass {
	public static void main(String[] args)
	{
		String str = "Hello";
		StringBuilder sb = new StringBuilder(str);
		sb.append(" World");
		System.out.println(sb.toString());
	}

}
