package com.SeleniumPractice.javaprogrames;

public class StaticArrayEg {

	public static void main(String[] args) {
		
		int[] intArrSalary = {10000, 20000, 30000, 40000, 50000, 60000};  

		int len = intArrSalary.length;
		System.out.println(len);
		
//		System.out.println(intArrSalary[3]);
		
//		for(int i = 0; i < len; i++)
//		{
//			System.out.println(intArrSalary[i]);
//		}
		
		for(int sal : intArrSalary)
		{
			System.out.println(sal);
		}
	}

}
