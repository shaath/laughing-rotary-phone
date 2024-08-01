package com.SeleniumPractice.javaprogrames;

public class InheritanceEg extends MethodsEg {

	public static void main(String[] args) {

		Function1();
		
		InheritanceEg ie = new InheritanceEg();
		ie.nonStaticEg();
	}
	
	public void nonStaticEg()
	{
		Function3();
		Function2();
	}
	
	public static void Function1()
	{
		System.out.println("This is InheritanceEg Function1 code");
	}

}
