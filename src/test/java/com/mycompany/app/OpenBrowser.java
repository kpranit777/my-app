package com.mycompany.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class OpenBrowser {
	  WebDriver driver;
	  
	  @BeforeMethod
	  public void beforeMethod()
	  {
			System.setProperty("webdriver.chrome.driver", "D:\\selenium setup & drivers\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
	  }

	@Test
	public void KiteLaunch()
	{
		driver.get("https://kite.zerodha.com");
		driver.manage().window().maximize();
		String ExpectedTitle = "Kite - Zerodha's fast and elegant flagship trading platform";
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ExpectedTitle, ActualTitle);
	}
	
	@Test
	public void FacebookLaunch()
	{
		driver.get("https://www.facebook.com");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		driver.close();
	}
}
