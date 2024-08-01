package testNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmpReg_testNG extends TestNGMaster{

	@Test(dataProvider = "data")
	public void orgEmpReg(String f, String l, String eid)
	{
		expval = f+" "+l;
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(f);
		driver.findElement(By.id("lastName")).sendKeys(l);
		driver.findElement(By.id("employeeId")).clear();
		driver.findElement(By.id("employeeId")).sendKeys(eid);
		driver.findElement(By.id("btnSave")).click();
		
		actval = driver.findElement(By.xpath("//div[@id='profile-pic']/h1")).getText();
		
		Assert.assertEquals(expval, actval, "Employee Registration Failed");
	}
	
	@DataProvider
	public Object[][] data()
	{
		Object[][] x = new Object[4][3];
		
		x[0][0] = "Rajitha";
		x[0][1] = "R";
		x[0][2] = "RR8541236";
		
		x[1][0] = "Vardini";
		x[1][1] = "V";
		x[1][2] = "VV8541257";
		
		x[2][0] = "Poojitha";
		x[2][1] = "P";
		x[2][2] = "PP854724";
		
		x[3][0] = "Gowry";
		x[3][1] = "G";
		x[3][2] = "GG85471236";
		
		return x;
 	}
	
}
