package day9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalandarEg {

	public static void main(String[] args) throws InterruptedException {
		
		String d = "18/May/2025";
		String[] split = d.split("/");
		
		String expMY = split[1]+" "+split[2];
		String expD = split[0];
		System.out.println(expMY+"-----"+expD);
		
		System.setProperty("webdriver.gecko.driver", "D:\\BugFindersRecordings/Jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.cleartrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		
		
		driver.findElement(By.xpath("//div[@class='p-relative']//*[local-name()='svg']/*[local-name()='path']")).click();

		driver.findElement(By.xpath("//*[local-name()='g' and contains(@mask, 'url')]/*[local-name()='path']/../../parent::button")).click();
		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0, 350)", "");
//		je.executeScript("arguments[0].scrollIntoView();", element);
//		je.executeScript("arguments[0].click();", element);
		Thread.sleep(3000);
		String actMY = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption']/div)[1]")).getText();
		
		while(!expMY.equalsIgnoreCase(actMY))
		{
			driver.findElement(By.xpath("//*[local-name()='svg' and @data-testid='rightArrow']")).click();
			actMY = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption']/div)[1]")).getText();
			Thread.sleep(2000);
		}
		
		List<WebElement> cells = driver.findElements(By.xpath("(//div[@class='DayPicker-Body'])[1]//div[@aria-disabled='false']"));
		
		for(int i = 0; i < cells.size(); i++){
			String D = cells.get(i).getAttribute("aria-label");
			System.out.println(D);
			
			String actD = D.split(" ")[2];
			
			if(actD.equals(expD))
			{
				cells.get(i).click();
				break;
			}
		}
	}

}
