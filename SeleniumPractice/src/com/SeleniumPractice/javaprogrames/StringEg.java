package com.SeleniumPractice.javaprogrames;

public class StringEg {

	public static void main(String[] args) {
		
		String course = "Selenium";
		
//		int len = course.length();
//		System.out.println(len);
//		
//		System.out.println(course.toUpperCase());
//		System.out.println(course.toLowerCase());
//		
//		System.out.println(course.charAt(4));
//		System.out.println(course.indexOf('n'));
//		
//		System.out.println(course.lastIndexOf('e'));
//		
//		System.out.println(course.substring(2, 5));
//		System.out.println(course.substring(2));
//		
//		System.out.println(course.equals("Selenium"));
//		System.out.println(course.equalsIgnoreCase("selenium"));
//		System.out.println(course.contains("Len"));
		
//		String x = course.trim();
//		System.out.println(x.length());

//		System.out.println(course.replace('e', 'X'));
//		System.out.println(course.replace("len", "xyz"));
//		System.out.println(course.replaceFirst("e", "Z"));
//		System.out.println(course.replaceAll(".", "XYZ"));
		
//		int i = 10;
//		String x = Integer.toString(i);
//		System.out.println(x);
		
//		System.out.println(course.startsWith("Sel"));
//		System.out.println(course.startsWith("eni", 3));
//		System.out.println(course.endsWith("ium"));
		
//		System.out.println(course.isEmpty());
		
//		System.out.println(course + " is an Opensource tool." + "Manual");
//		System.out.println(course.concat(" is an Opensource Tool"));
		System.out.println(course.join("&&&", course, "is an openSource.", "Manual", "UFT"));
	}

}
