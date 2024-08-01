package com.SeleniumPractice.javaprogrames;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEg {

	public static void main(String[] args) {
		
		Set<Object> hs = new HashSet<>();
		
		hs.add("Selenium");
		hs.add(485757);
		hs.add(true);
		hs.add("apple");
		hs.add("Manual");
		hs.add("Selenium");
		
//		hs.clear();
//		hs.contains("Manual");
//		hs.remove("apple");
//		hs.isEmpty();
		
//		System.out.println(hs.size());
//		
//		for(Object d: hs)
//		{
//			System.out.println(d);
//		}
		
		Iterator<Object> it = hs.iterator();
		
		while(it.hasNext())
		{
			Object d = it.next();
			System.out.println(d);
		}

	}

}
