package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksEg3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\BugFindersRecordings/Jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://primusbank.qedgetech.com/sitemap.html");
		
//		driver.findElement(By.linkText("Home")).click();

//		driver.findElement(By.xpath("//a[@href='home.aspx']")).click();
		
//		List<WebElement> links = driver.findElements(By.xpath("(//table[contains(@id,'Table')])[2]//a"));
//		System.out.println(links.size());
//		
//		for(WebElement e: links)
//		{
//			String lName = e.getText();
//			System.out.println(lName);
//			
//			if(lName.equalsIgnoreCase("Home"))
//			{
//				e.click();
//				break;
//			}
//		}
		
		driver.findElement(By.xpath("(//table[contains(@id,'Table')])[2]")).findElement(By.linkText("Home")).click();
	}

}
