package com.mycompany.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KiteLogin_Page
{
	WebDriver driver;
	
	public KiteLogin_Page(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By Username = By.xpath("//input[@id='userid']");
	By Password = By.xpath("//input[@id='password']");
	By Loginbutton = By.xpath("//button");
	By ForgotPassword = By.xpath("//a[contains(text(),'Forgot')]");
	By Loginpin = By.xpath("//input[@id='pin']");
	By ContinueButton = By.xpath("//button[contains(text(),'Continue ')]");
	
	public void ClickLogin(String Uname , String Pass )
	{
		driver.findElement(Username).sendKeys(Uname);
		driver.findElement(Password).sendKeys(Pass);
		driver.findElement(Loginbutton).click();
	}
	
	public void ForgotPassword()
	{
		driver.findElement(ForgotPassword).click();
	}
	
	public void ClickPin(String pin)
	{
		driver.findElement(Loginpin).sendKeys(pin);
		driver.findElement(ContinueButton).click();
	}
}
