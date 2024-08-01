package com.SeleniumPractice.javaprogrames;

public class NestedIfEg {

	public static void main(String[] args) {
		int a = 10;
		int b = 50;
		int c = 50;
		
		if(a > b && a > c)
		{
			System.out.println("A is Greater");
		}
		else if(b > a && b > c)
		{
			System.out.println("B is Greater");
		}
		else if(c > a && c > b)
		{
			System.out.println("C is Greater");
		}
		else
		{
			System.out.println("Give Proper values to the variables");
		}

	}

}
