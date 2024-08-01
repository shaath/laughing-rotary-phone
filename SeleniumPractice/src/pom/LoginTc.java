package pom;

import org.openqa.selenium.support.PageFactory;

import commonUtils.GenericMethods;

public class LoginTc extends GenericMethods{

	public static void main(String[] args) throws InterruptedException {
		
		brLaunch("Firefox");
		
		LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
		
		driver.get(lp.url);
		lp.login();
		
		Thread.sleep(5000);
		
		AdminHomePage ap = PageFactory.initElements(driver, AdminHomePage.class);
		
		ap.welcomeclick();
		ap.logoutclick();
		
		driver.close();
	}

}
