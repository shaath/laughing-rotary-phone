package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownEg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\BugFindersRecordings/Jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");

		WebElement country = driver.findElement(By.name("country"));
		
		Select s = new Select(country);
		
//		s.selectByIndex(4);
//		Thread.sleep(5000);
//		s.selectByValue("FRANCE");
//		Thread.sleep(5000);
//		s.selectByVisibleText("INDIA");
				
		List<WebElement> drop = s.getOptions();
		System.out.println(drop.size());
		
		for(int i = 0; i < drop.size(); i++)
		{
			s.selectByIndex(i);
			
			String cName = drop.get(i).getText();
			System.out.println(cName);
		}
	}

}
