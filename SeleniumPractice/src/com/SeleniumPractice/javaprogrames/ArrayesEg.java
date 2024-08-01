package com.SeleniumPractice.javaprogrames;

public class ArrayesEg {

	public static void main(String[] args) {
		
		String x = "75 test cases passed out of 100 test cases";
		
		String[] arrStrSplit = x.split(" ");
		System.out.println(arrStrSplit.length);
		
		String pCount = arrStrSplit[0];
		String tCount = arrStrSplit[6];
		
		System.out.println("Passed Testcases count "+pCount);
		System.out.println("Total Testcases count "+tCount);
		
		int fCount = Integer.parseInt(tCount) - Integer.parseInt(pCount);
		System.out.println("Failed Testcases count "+fCount);

	}

}
