package com.SeleniumPractice.javaprogrames;

public class ObjectEg {

	public static void main(String[] args) {
		
		Object[] objArrValue = {10000, 'M', "Selenium", 343253.234, true};
		
		int len = objArrValue.length;
		System.out.println(len);
		
		for(Object data: objArrValue)
		{
			System.out.println(data);
		}

	}

}
