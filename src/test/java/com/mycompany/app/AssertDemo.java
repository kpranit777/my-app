package com.mycompany.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertDemo {
public WebDriver driver;
	@Test(priority=1)
	public void OpenBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium setup & drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com");
		Reporter.log("we are successfully launching kite in chrome");
	}
	@Test(priority=2)
	public void ChechTitle()
	{
		String Expected = "Kite - Zerodha's fast and elegant flagship trading platform";
		String Actual = driver.getTitle();
		Assert.assertEquals(Expected, Actual);
		Reporter.log("we are successfully fetching the title of kite's home page");
	}
}
