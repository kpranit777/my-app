package com.mycompany.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	public WebDriver driver;
	@Test
	public void Chrome()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium setup & drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void edge()
	{
	System.setProperty("webdriver.edge.driver", "D:\\selenium setup & drivers\\edgedriver_win64\\msedgedriver.exe");
	driver = new EdgeDriver();
	driver.get("https://www.facebook.com");
	}
}
