package day13;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadEg {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", "D:\\BugFindersRecordings/Jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://orangehrm.qedgetech.com");

		WebElement uname = driver.findElement(By.id("txtUsername"));
		
		uname.sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(5000);

		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		Thread.sleep(5000);
		
//		driver.findElement(By.id("photofile")).click();
		
		driver.findElement(By.id("photofile")).sendKeys("C:\\Users\\SharatChandra\\Downloads\\PF_ServiceHistory.png");
		
//		JavascriptExecutor je = (JavascriptExecutor) driver;
//		je.executeScript("arguments[0].click();", driver.findElement(By.id("photofile")));
//		Thread.sleep(5000);
		
//		Runtime.getRuntime().exec("C:\\Users\\SharatChandra\\Desktop\\FileUpload2.exe");
		
	}

}
