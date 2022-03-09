package com.mycompany.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GroupsDemo {
	public WebDriver driver;
	
	@Test(groups = "sanity")
	public void LaaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium setup & drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test(groups= "regression",dependsOnGroups = "sanity")
	public void OpenFB()
	{
		driver.get("https://www.facebook.com");
	}
	
	@Test(groups="retest",dependsOnGroups = {"sanity", "regression"})
	public void GetTitle()
	{
		System.out.println(driver.getTitle());
	}
}
