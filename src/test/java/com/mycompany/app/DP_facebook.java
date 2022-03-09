package com.mycompany.app;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class DP_facebook {
  @Test(dataProvider = "dp")
  public void f(String user, String pass)
  {
	  System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  WebElement username =  driver.findElement(By.xpath("//input[@id='email']"));
	  username.sendKeys(user);
	  
	  WebElement password =  driver.findElement(By.xpath("//input[@id='pass']"));
	  password.sendKeys(pass);
 }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      { "kpranit312@gmail.com", "pskpsk123" },
      { "atulkin.5366@gamil.com", "akakak123" },
      { "akulkarni.2346@gamil.com", "ak47ak47" },
    };
  }
}
