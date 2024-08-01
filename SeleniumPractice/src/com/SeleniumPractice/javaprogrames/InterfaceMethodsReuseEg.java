package com.SeleniumPractice.javaprogrames;

public class InterfaceMethodsReuseEg {

	public static void main(String[] args) {
		
		InterfaceEg ie1 = new InterfaceImplementsEg1();
		ie1.Vehicle();
		
		InterfaceEg ie2 = new InterfaceImplementsEg2();
		ie2.Vehicle();
	}

}
