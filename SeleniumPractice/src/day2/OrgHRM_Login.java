package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrgHRM_Login {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.gecko.driver", "D:\\BugFindersRecordings/Jars\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		
//		System.setProperty("webdriver.edge.driver", "D:\\BugFindersRecordings\\Jars\\msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();
		
		System.setProperty("webdriver.chrome.driver", "D:\\BugFindersRecordings\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://orangehrm.qedgetech.com");

		WebElement uname = driver.findElement(By.id("txtUsername"));
		
//		uname.click();
//		Thread.sleep(5000);
		uname.sendKeys("Admin");
//		Thread.sleep(5000);
//		uname.clear();
		
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.partialLinkText("Welcome")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Logout")).click();
		
//		driver.close();
		driver.quit();
	}

}
