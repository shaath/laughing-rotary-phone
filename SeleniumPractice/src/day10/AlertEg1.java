package day10;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertEg1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "D:\\BugFindersRecordings/Jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://primusbank.qedgetech.com/");
		
		driver.findElement(By.id("login")).click();
		Thread.sleep(5000);
		Alert alt = driver.switchTo().alert();
		
		System.out.println(alt.getText());
		alt.accept();

	}

}
