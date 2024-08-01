package day10;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertEg3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\BugFindersRecordings/Jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		
		Thread.sleep(5000);
		
		Alert alt = driver.switchTo().alert();
		
		alt.sendKeys("Test Entry");
		alt.accept();

	}

}
