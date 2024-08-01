package com.SeleniumPractice.javaprogrames;

import java.util.HashMap;
import java.util.Map;

public class HashMapEg {

	public static void main(String[] args) {
		
		HashMap<Object, Object> hm = new HashMap<>();
		
		hm.put("Course", "Selenium");
		hm.put("Month", "Jun");
		hm.put(45, "Age");
		hm.put("Desg", 'M');
		hm.put("Month", "July");
		
		hm.remove(45);
		System.out.println(hm.keySet());
		
//		System.out.println(hm.get("Month"));
//		
//		System.out.println(hm.size());
//
//		System.out.println(hm);
//		
//		for(Map.Entry<Object, Object> entry: hm.entrySet())
//		{
//			System.out.println(entry.getKey() + "-----" + entry.getValue());
//		}
		
		for(Object k: hm.keySet())
		{
			System.out.println(hm.get(k));
		}
	}

}
