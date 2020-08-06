package AcademyTest;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.Landingpage;
import PageObject.Login;
import resources.base;

public class HomePage extends base{
	
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
		
		Landingpage l = new Landingpage(driver);
		l.getLogo().click();
		log.info("Landing page is there");
		
		
	}
	
	@AfterTest
	
	public void closeBrowser()
	{
		driver.close();
	}
	

}
