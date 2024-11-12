package com.test.org;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPractice1 {
	public static void main(String[] args)
	{
		Set<String>st = new HashSet<String>();
		st.add("mani");
		st.add("mw");
		st.add("mi");
		st.add("me");
		for(String s:st)
		{
			System.out.println(s);
		}
		Iterator<String>itr = st.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
