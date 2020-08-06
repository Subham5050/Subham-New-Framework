package AcademyTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.Landingpage;
import PageObject.Login;
import resources.base;

public class Loginwithidvalidation extends base{
	
	public WebDriver driver;
	
	
	
	@BeforeTest
	public void initilize() throws IOException
	{
		driver=initializeDriver();
		
		
	}
	
	@Test(dataProvider = "getData")
	public void basePageNavigation(String email,String pass) throws IOException
	{
		driver.get(prop.getProperty("url"));
		Login lg = new Login(driver);
		lg.username().sendKeys("email");
		lg.password().sendKeys("pass");
		//lg.Loginbutton().click();
		

		
		
	}
	
	@AfterTest
	
	public void closeBrowser()
	{
		driver.close();
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] obj = new Object[2][2];
		
		obj[0][0] = "user1";
		obj[0][1] = "pass1";
		obj[1][0] = "user2";
		obj[1][1] = "pass2";
		
		return obj;
	}

}
