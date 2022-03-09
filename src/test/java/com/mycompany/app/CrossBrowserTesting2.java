package com.mycompany.app;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;

public class CrossBrowserTesting2 {
	public WebDriver driver;
	@Parameters("browser")

  @BeforeClass
  public void beforeClass(String browser)
  {
	  if(browser.equalsIgnoreCase("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "D:\\selenium setup & drivers\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
	  }
	  else if(browser.equalsIgnoreCase("edge"))
	  {
		  System.setProperty("webdriver.edge.driver", "D:\\selenium setup & drivers\\edgedriver_win64\\msedgedriver.exe");
		  driver = new EdgeDriver();
	  }
  }
	
	  @Test
	  public void LoginTest()
		{
			driver.get("https://kite.zerodha.com");
			driver.findElement(By.id("userid")).sendKeys("LCM358");
			driver.findElement(By.id("password")).sendKeys("Zerodha.psk@777");
			driver.findElement(By.tagName("button")).click();
		}
	  
  @AfterClass
  public void afterClass()
  {
	  driver.close();
  }

}
