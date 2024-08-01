package day6;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotEg2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", "D:\\BugFindersRecordings/Jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://bing.com");
		Thread.sleep(60000);
		
		File src = driver.findElement(By.id("id_mobile")).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("D:\\BugFindersRecordings\\Workspace\\SeleniumPractice\\src\\screenshots\\Mobile.jpg"));

	}

}
