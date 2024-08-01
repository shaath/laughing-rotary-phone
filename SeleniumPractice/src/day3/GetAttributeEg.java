package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAttributeEg {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\BugFindersRecordings/Jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://google.com");
		
//		String txt = driver.findElement(By.xpath("//a[@aria-label='Gmail ']")).getAttribute("href");
//		System.out.println(txt);

		WebElement gmail = driver.findElement(By.xpath("//a[@aria-label='Gmail ']"));
		
//		System.out.println(gmail.isDisplayed());
		System.out.println(gmail.isEnabled());
	}

}
