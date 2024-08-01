package com.SeleniumPractice.javaprogrames;

public class MethodsReuseEg {

	public static void main(String[] args) {
		
		MethodsEg me = new MethodsEg();
		
		me.Function3();
		
		int res = me.sum(60, 40);
		System.out.println(res);
		
		res = me.sum(40, 50, 60);
		System.out.println(res);
	}

}
