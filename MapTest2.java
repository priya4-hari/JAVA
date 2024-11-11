package com.test.org;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest2 {
	public static void main(String[] args)
	{
		Map<String,Integer>mp = new HashMap<String,Integer>();
		mp.put("one", 1);
		mp.put("five", 5);
		mp.put("ten", 10);
		mp.put("nine", 9);
		mp.put("five", 555);
		Set<String>s = mp.keySet();
		for(String key:s)
		{
			System.out.println(key);
			System.out.println(mp.get(key));
		}
	}

}
