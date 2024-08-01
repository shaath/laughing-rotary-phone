package com.SeleniumPractice.javaprogrames;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEg {

	public static void main(String[] args) {
		
		ArrayList<Object> al = new ArrayList<>();
		
		al.add("Selenium");
		al.add(40000);
		al.add(true);
		al.add('M');
		al.add(57320.234);
		al.add("Selenium");
		al.add(6, "Apple");
		al.add(2, "Sharat");
//		al.add(10, "Boll");
		
		
//		al.remove(6);
//		al.clear();
//		al.clone();
//		System.out.println(al.contains("Apple"));
//		System.out.println(al.indexOf("Selenium"));
//		System.out.println(al.lastIndexOf("Selenium"));
//		al.isEmpty();
//		List<Object> subL = al.subList(2, 4);
		al.set(2, "Manual");
		al.trimToSize();
		
		int len = al.size();
		System.out.println(len);
		
//		System.out.println(al.get(3));
		for(int i = 0; i < len; i++)
		{
			System.out.println(al.get(i));
		}
		

	}

}
