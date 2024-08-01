package day8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableEg2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\BugFindersRecordings/Jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://orangehrm.qedgetech.com");

		WebElement uname = driver.findElement(By.id("txtUsername"));
		uname.sendKeys("Admin");	
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Employee List")).click();
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		System.out.println(rows.size());
		
		for(int i = 0; i < rows.size(); i++)
		{
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			String id = cols.get(1).getText();
			System.out.println(id);	
			
			if(id.equals("0999"))
			{
				cols.get(0).click();
				Thread.sleep(5000);
				driver.findElement(By.id("btnDelete")).click();
				Thread.sleep(5000);
				driver.findElement(By.id("dialogDeleteBtn")).click();
				
				break;
			}
		}

	}

}
