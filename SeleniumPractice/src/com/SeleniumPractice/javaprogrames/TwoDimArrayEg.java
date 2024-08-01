package com.SeleniumPractice.javaprogrames;

public class TwoDimArrayEg {

	public static void main(String[] args) {
		
		Object[][] x = new Object[2][3];
		
		int rLen = x.length;
		int cLen = x[0].length;
		
		System.out.println("Rows length " + rLen);
		System.out.println("Columns Length " + cLen);
		
		x[0][1]  = "Selenium";
		x[1][2] = 50000;
		
//		System.out.println(x[0][1]);
		
		for(int i = 0; i < rLen; i++)
		{
			for(int j = 0; j < cLen; j++ )
			{
				System.out.println(x[i][j]);
			}
		}

	}

}
