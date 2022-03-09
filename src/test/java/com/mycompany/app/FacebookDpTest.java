package com.mycompany.app;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class FacebookDpTest {
	public WebDriver driver;
  @Test(dataProvider = "dp")
  public void FacebookLogin(String username, String password) {
	  System.setProperty("webdriver.chrome.driver", "D:\\selenium setup & drivers\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
	  driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
	  driver.findElement(By.xpath("//button[@name='login']")).click();
  }

  @DataProvider
  public Object[][]dp() {
    return new Object[][] {
     { "abcd","efgh" },
     { "PS" , "1234" },
    };
  }
}
