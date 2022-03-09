package com.mycompany.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReporterLog {
	public WebDriver driver;
	
	@Test
	public void LaunchChrome()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium setup & drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		Reporter.log("we are launching chrome driver successfully", true);
	}
	
	@Test(dependsOnMethods = "LaunchChrome")
	public void openKite()
	{
		driver.get("https://kite.zerodha.com");
		Reporter.log("we are launching 'kite.zerodha.com' successfully", true);
	}
}
