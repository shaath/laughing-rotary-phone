package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GridEg {

	@Parameters({"br", "pt"})
	@Test
	public void grid(String br, String pt) throws MalformedURLException, InterruptedException
	{
		System.out.println(br +"----"+ pt);
		DesiredCapabilities cap = new DesiredCapabilities();
		
		if(br.equalsIgnoreCase("firefox") && pt.equalsIgnoreCase("Windows"))
		{
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}
		else if (br.equalsIgnoreCase("chrome") && pt.equalsIgnoreCase("Windows")) {
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
		}
		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.138:4444"), cap);
		
		driver.get("http://orangehrm.qedgetech.com");

		WebElement uname = driver.findElement(By.id("txtUsername"));
		uname.sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.partialLinkText("Welcome")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Logout")).click();
		
		driver.close();
	}
}
