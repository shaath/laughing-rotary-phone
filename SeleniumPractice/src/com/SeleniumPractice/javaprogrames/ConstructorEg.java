package com.SeleniumPractice.javaprogrames;

public class ConstructorEg {

	ConstructorEg()
	{
		System.out.println("This is a constructor example");
	}
	
	ConstructorEg(String name, int age)
	{
		System.out.println("Name "+ name + "----" + "Age " + age);
	}
	
	public static void main(String[] args) {
		
		ConstructorEg ce = new ConstructorEg("Vinay", 45);
		ConstructorEg ce1 = new ConstructorEg();
	}
}
