package com.mycompany.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependsDemo {
	public WebDriver driver;
	
	@Test
	public void LaunchChrome()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium setup & drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test(dependsOnMethods = "LaunchChrome")
	public void openKite()
	{
		driver.get("https://kite.zerodha.com");
	}
	
	@Test(dependsOnMethods = "openKite")
	public void Title()
	{
		System.out.println(driver.getTitle());
	}
}
