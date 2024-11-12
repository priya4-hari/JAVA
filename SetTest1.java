package com.test.org;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest1 {
	public static void main(String[] args)
	{
		Set<String> st = new TreeSet<String>();
		st.add("mani");
		st.add("mw");
		st.add("mv");
		st.add("mi");
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
