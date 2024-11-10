package com.test.org;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListTest2 {
	public static void main(String[] args)
	{
		List<String> li = Arrays.asList("one","two","three","four");
		for(String s:li)
		{
			System.out.println(s);
		}
		for(int i=0;i<li.size();i++)
		{
			System.out.println(li.get(i));
		}
		Collections.sort(li);
		for(int i=0;i<li.size();i++)
		{
			System.out.println(li.get(i));
		}
	}

}
