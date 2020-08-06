package AcademyTest;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.Login;
import resources.base;


public class Validatethetext extends base{
	
	public WebDriver driver;
	
	public static Logger log = LogManager.getLogger(base.class.getName());

	
	@BeforeTest
	public void initilize() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		
		
	}
	
	
	@Test
	public void basePageNavigation() throws IOException 
	{

		Login lg = new Login(driver);
		Assert.assertEquals(lg.getTitle().getText(), "Facebook helps you connect and share with the people in your li");
		log.error("Error is generated");
		
		//Assert.assertTrue(lg.getTitle().isDisplayed());
		
		
	}
	
	@AfterTest
	
	public void closeBrowser()
	{
		driver.close();
	}


}
