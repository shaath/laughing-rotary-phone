package commonUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericMethods {

	public static WebDriver driver;
	
	public static void brLaunch(String br)
	{
		if(br.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\BugFindersRecordings/Jars\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if (br.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\BugFindersRecordings\\Jars\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (br.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "D:\\BugFindersRecordings\\Jars\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
	}
}
