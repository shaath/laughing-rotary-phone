package com.SeleniumPractice.javaprogrames;

public class SwitchCaseEg {

	public static void main(String[] args) {
		
		String course = "Selenium";
		
		switch(course)
		{
		case "Selenium":
			System.out.println("You are selected Selenium");
			break;
		case "Manual":
			System.out.println("YOu are selected Manual");
			break;
		case "UFT":
			System.out.println("You are selected UFT");
			break;
		default:	
			System.out.println("Select a proper course");
			break;
		}

	}

}
