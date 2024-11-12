package com.test.org;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetPractice2 {
	public static void main(String[] args)
	{
		Set<String>st = new LinkedHashSet<String>();
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
