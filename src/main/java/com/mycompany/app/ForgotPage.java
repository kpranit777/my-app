package com.mycompany.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPage
{
	WebDriver driver;
	public ForgotPage(WebDriver driver)
	{
		this.driver = driver;
	}
	By UserID = By.xpath("//input[@placeholder='User ID']");
	By PAN = By.xpath("//input[@placeholder='PAN']");
	
	public void Details_For_ForgotPage()
	{
		driver.findElement(UserID).sendKeys("123456");
		driver.findElement(PAN).sendKeys("pranit126845");
	}
}
