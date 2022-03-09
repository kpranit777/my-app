package com.mycompany.app;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DashBoard_Page
{
	WebDriver driver;
	public DashBoard_Page(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By searchbox = By.xpath("//input[@icon='search']");
//	By MRF_NSE = By.xpath("//span[contains(text(),'MRF ')]//following-sibling::span[contains(text(),'NSE ')]");
	By AddBtn = By.xpath("//button[@class='button-green']");
	By ProfileBtn = By.xpath("//span[contains(text(),'PS')]");
	By Logout = By.xpath("//a[@href='/logout']");
	
	public void WatchList()
	{
		driver.findElement(searchbox).sendKeys("MRF");
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'MRF ')]//following-sibling::span[contains(text(),'NSE ')]")));
		driver.findElement(AddBtn).click();
		driver.findElement(ProfileBtn).click();
		driver.findElement(Logout).click();
	}
}
