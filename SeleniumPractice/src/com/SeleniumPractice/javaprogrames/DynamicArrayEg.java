package com.SeleniumPractice.javaprogrames;

public class DynamicArrayEg {

	public static void main(String[] args) {
		
		Object[] x = new Object[5];
		
		int len = x.length;
		System.out.println(len);
		
//		System.out.println(x[2]);
		
		x[2] = "Selenium";
		x[0] = 50000;
		x[2] = "Apple";
		
		for(Object obj: x)
		{
			System.out.println(obj);
		}

	}

}
