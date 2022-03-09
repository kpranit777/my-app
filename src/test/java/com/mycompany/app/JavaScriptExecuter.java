package com.mycompany.app;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JavaScriptExecuter {
		WebDriver driver;
	
	@BeforeTest
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@Test
	public void JsExecuter()
	{
		driver.get("https://www.google.com");
		WebElement SearchBox = driver.findElement(By.xpath("//input[@title='Search']"));
		WebElement GoogleSearchBtn =  driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//child::center//child::input[@value='Google Search']"));
		//creating JavascriptExecutor's object by typecasting as follows-->
		JavascriptExecutor Js = (JavascriptExecutor)driver;
		
		Js.executeScript("arguments[0].value='India';", SearchBox);
		Js.executeScript("arguments[0].click();", GoogleSearchBtn);
		Js.executeScript("window.location='https://www.facebook.com'");
		Js.executeScript("alert('You have successfully switched to facebook')");
		driver.switchTo().alert().accept();
		
		String URL = Js.executeScript("return document.URL;").toString();
		System.out.println("The url name is :- " + URL);
		String Title = Js.executeScript("return document.title").toString();
		System.out.println("The title of page is :- " + Title);
		String Domain = Js.executeScript("return document.domain").toString();
		System.out.println("The Domain of page is :- " + Domain);
		
		//Method to scroll down to certain element.
		
		Js.executeScript("window.location='https://www.google.com'");
		WebElement SearchBox1 = driver.findElement(By.xpath("//input[@title='Search']"));
		Js.executeScript("arguments[0].value='India';", SearchBox1);
		WebElement GoogleSearchBtn1 =  driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//child::center//child::input[@value='Google Search']"));
		Js.executeScript("arguments[0].click();", GoogleSearchBtn1);
		WebElement RBIofficialLink = driver.findElement(By.xpath("//h3[contains(text(),'Reserve Bank of India')]"));
		Js.executeScript("arguments[0].scrollIntoView(true);", RBIofficialLink);
	}
}
