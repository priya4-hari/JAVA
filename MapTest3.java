package com.test.org;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapTest3 {
	public static void main(String[] args)
	{
		Map<String,Integer> mp = new LinkedHashMap<String,Integer>();
		mp.put("five", 5);
		mp.put("nine", 9);
		mp.put("one", 1);
		mp.put("five", 545);
		Set<String>s=mp.keySet();
		for(String key:s)
		{
			System.out.println(key);
			System.out.println(mp.get(key));
		}
	}

}
