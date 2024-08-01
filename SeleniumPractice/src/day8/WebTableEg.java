package day8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableEg {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\BugFindersRecordings/Jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://orangehrm.qedgetech.com");

		WebElement uname = driver.findElement(By.id("txtUsername"));
		uname.sendKeys("Admin");	
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Employee List")).click();
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		System.out.println(rows.size());
		
		for(int i = 0; i < rows.size(); i++)
		{
//			String rText = rows.get(i).getText();
//			System.out.println(rText);
			
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			String f = cols.get(2).getText();
			System.out.println(f);
			
			cols.get(0).click();	
		}
	}

}
