package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	
	public WebDriver driver;

	
	
	By userid = By.xpath("//input[@id='email']");
	By password = By.xpath("//input[@id='pass']");
	By loginbutton = By.xpath("//input[@type='submit']");
	By maintext = By.xpath("//div[contains(text(),'Facebook helps you')]");
	
	public Login(WebDriver driver) 
	{
		this.driver = driver;
	}

	public WebElement username()
	{
		return driver.findElement(userid);

	}
	
	public WebElement password()
	{
		return driver.findElement(password);
	}
	
	public WebElement Loginbutton()
	{
		return driver.findElement(loginbutton);
	}
	
	public WebElement getTitle()
	{
		return driver.findElement(maintext);
	}

	

}
