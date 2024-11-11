package com.test.org;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapTest4 {
	public static void main(String[] args)
	{
		Map<String,Integer>mp = new TreeMap<String,Integer>();
		mp.put("one", 1);
		mp.put("word", 23);
		mp.put("three", 3);
		mp.put("four", 4);
		Set<String>s=mp.keySet();
		for(String key:s)
		{
			System.out.println(key);
			System.out.println(mp.get(key));
		}
	}

}
