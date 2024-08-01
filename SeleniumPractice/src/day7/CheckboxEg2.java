package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckboxEg2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\BugFindersRecordings/Jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://echoecho.com/htmlforms09.htm");
		
		List<WebElement> checks = driver.findElements(By.xpath("//input[contains(@name, 'option')]"));
		
		System.out.println(checks.size());
		
		for(int i = 0; i < checks.size(); i++)
		{
			String cname = checks.get(i).getAttribute("value");
			System.out.println(cname);
			
			if(!checks.get(i).isSelected())
			{
				checks.get(i).click();
			}
		}

	}

}
