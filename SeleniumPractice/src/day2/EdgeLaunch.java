package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeLaunch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "D:\\BugFindersRecordings\\Jars\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://selenium.dev");

	}

}
