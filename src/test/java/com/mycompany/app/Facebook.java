package com.mycompany.app;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Facebook {
	public WebDriver driver;
	
	@Test
	public void facebook()
	{
		  System.setProperty("webdriver.chrome.driver", "D:\\selenium setup & drivers\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://www.facebook.com");
		  driver.manage().timeouts().implicitlyWait(300, TimeUnit.MILLISECONDS);
		  WebElement CreateAC = driver.findElement(By.linkText("Create New Account"));
		  CreateAC.click();
		  WebElement Username = driver.findElement(By.xpath("//input[@name='firstname']"));
		  Username.sendKeys("Pranit");
		 
	}

}
