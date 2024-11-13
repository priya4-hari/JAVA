package com.test.org;

public class StringBufferTest {
	public static void main(String[] args)
	{
		String str = "Hello";
		StringBuffer sb = new StringBuffer(str);
		sb.append(" World");
		System.out.println(sb.toString());
	}

}
