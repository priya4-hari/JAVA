package com.test.org;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListPractice2 {
	public static void main(String[] args)
	{
		List<String> li = Arrays.asList("one","two","three","four");
		for(int i=0;i<li.size();i++)
		{
			System.out.println(li.get(i));
		}
		for(String s:li)
		{
			System.out.println(s);
		}
		Collections.sort(li);
		for(int i=0;i<li.size();i++)
		{
			System.out.println(li.get(i));
		}
	}

}
