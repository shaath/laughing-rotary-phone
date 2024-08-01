package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_KeboardActionsEg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\BugFindersRecordings/Jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement un = driver.findElement(By.id("email"));
		
		Actions act = new Actions(driver);
		
		act.click(un).perform();
		Thread.sleep(5000);
		act.sendKeys(Keys.chord("Test")).perform();
		Thread.sleep(5000);
		act.doubleClick().perform();
		Thread.sleep(5000);
		act.keyDown(Keys.CONTROL).sendKeys(Keys.chord("C")).keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(5000);
		
//		WebElement pass = driver.findElement(By.id("pass"));
//		act.click(pass).perform();
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(5000);
		act.keyDown(Keys.CONTROL).sendKeys(Keys.chord("V")).keyUp(Keys.CONTROL).build().perform();
	}

}
