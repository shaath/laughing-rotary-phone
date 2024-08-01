package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonsEg {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\BugFindersRecordings/Jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://echoecho.com/htmlforms10.htm");

		List<WebElement> radios = driver.findElements(By.xpath("//input[contains(@name, 'group')]"));
		System.out.println(radios.size());
		
		for(int i = 0; i < radios.size(); i++)
		{
			String rname = radios.get(i).getAttribute("value");
			System.out.println(rname);
			
//			if(rname.equalsIgnoreCase("Milk"))
//			{
//				radios.get(i).click();
//			}
//			else if (rname.equalsIgnoreCase("Water"))
//			{
//				radios.get(i).click();
//			}
			
			if(rname.equalsIgnoreCase("Milk") || rname.equalsIgnoreCase("Water"))
			{
				radios.get(i).click();
			}
		}
		
	}

}
