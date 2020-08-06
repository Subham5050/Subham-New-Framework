package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Landingpage {
	
	public WebDriver driver;
	
	By logo = By.xpath("//a[@title='Go to Facebook home']");
	
	public Landingpage(WebDriver driver) 
	{
		this.driver = driver;
	}

	public WebElement getLogo()
	{
		return driver.findElement(logo);
		


	}
	

}
