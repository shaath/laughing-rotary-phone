package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropEg {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\BugFindersRecordings/Jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement fr = driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(fr);
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		
//		act.dragAndDrop(drag, drop).perform();
		act.clickAndHold(drag).moveToElement(drop).click().build().perform();
		
		
		driver.switchTo().defaultContent();
		
	}

}
