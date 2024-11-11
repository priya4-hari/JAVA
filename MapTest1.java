package com.test.org;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest1 {
	public static void main(String[] args)
	{
		Map<String,Integer>mp = new HashMap<String,Integer>();
		mp.put("five", 5);
		mp.put("three", 3);
		mp.put("one", 1);
		mp.put("ten", 10);
		Set<String> s = mp.keySet();
		for(String str:s)
		{
			System.out.println(str);
		}
	}

}
