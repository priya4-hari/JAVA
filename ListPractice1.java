package com.test.org;

import java.util.ArrayList;
import java.util.List;

public class ListPractice1 {
	public static void main(String[] args)
	{
		List<String>li = new ArrayList<String>();
		li.add("one");
		li.add("two");
		li.add("three");
		li.add("four");
		for(int i=0;i<li.size();i++)
		{
			System.out.println(li.get(i));
		}
		for(String s:li)
		{
			System.out.println(s);
		}
	}

}
