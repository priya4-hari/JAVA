package com.test.org;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapPractice2 {
	public static void main(String[] args)
	{
		Map<String,Integer>mp = new LinkedHashMap<String,Integer>();
		mp.put("one", 1);
		mp.put("two", 2);
		mp.put("three",3);
		mp.put("four", 4);
		Set<String>s=mp.keySet();
		for(String key:s)
		{
			System.out.println(key);
			System.out.println(mp.get(key));
		}
	}

}
