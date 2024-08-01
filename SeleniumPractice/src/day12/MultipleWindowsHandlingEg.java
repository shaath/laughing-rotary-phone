package day12;

import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsHandlingEg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\BugFindersRecordings/Jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://gmail.com");
		String gmail = driver.getWindowHandle();
//		System.out.println(gmail);
		
		driver.findElement(By.linkText("Privacy")).click();
		Thread.sleep(5000);
		Set<String> s = driver.getWindowHandles();
		
		for(String wid: s)
		{
			System.out.println(wid);
			
			driver.switchTo().window(wid);
			
//			if(driver.getTitle().contains("Privcacy"))
//			{
//				driver.findElement(By.xpath("(//a[text()='Terms of Service'])[1]")).click();
//				break;
//			}
			
			try
			{
				driver.findElement(By.xpath("(//a[text()='Terms of Service'])[1]")).click();
				Thread.sleep(5000);
				System.out.println(driver.getTitle()+"----"+driver.getCurrentUrl());
				break;
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			
		}
		
		driver.switchTo().window(gmail);
		driver.findElement(By.linkText("Help")).click();

	}

}
