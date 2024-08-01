package day5;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class LinksEg4 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", "D:\\BugFindersRecordings/Jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
//		System.setProperty("webdriver.chrome.driver", "D:\\BugFindersRecordings\\Jars\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		
		driver.get("http://primusbank.qedgetech.com/sitemap.html");
		
		List<WebElement> links = driver.findElements(By.xpath("(//table[contains(@id,'Table')])[2]//a"));
		System.out.println(links.size());
		
		for(int i = 0; i < links.size(); i++)
		{
			String lName = links.get(i).getText();
			System.out.println(lName);
			
			links.get(i).click();
			Thread.sleep(5000);
			System.out.println(driver.getTitle()+"-----"+driver.getCurrentUrl());
			
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File("D:\\BugFindersRecordings\\Workspace\\SeleniumPractice\\src\\screenshots\\"+ lName +".png"));
			
			driver.navigate().back();
			Thread.sleep(5000);
			links = driver.findElements(By.xpath("(//table[contains(@id,'Table')])[2]//a"));
		}
	}
}
