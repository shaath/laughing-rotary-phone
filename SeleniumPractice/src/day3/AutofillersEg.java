package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutofillersEg {

	public static void main(String[] args) throws InterruptedException {
		
//		System.setProperty("webdriver.gecko.driver", "D:\\BugFindersRecordings/Jars\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\BugFindersRecordings\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Shi");
		Thread.sleep(5000);
		
		List<WebElement> afList = driver.findElements(By.xpath("//div/text[@class='placeHolderMainText']"));
		
		System.out.println(afList.size());
		
		for(int i = 0; i < afList.size(); i++)
		{
			String cName = afList.get(i).getText();
			System.out.println(cName);
			
			if(cName.equalsIgnoreCase("Shirpur"))
			{
				afList.get(i).click();
				break;
			}
		}
	}

}
