package com.mycompany.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class InheritedDepends extends DependsDemo{

	@Test(dependsOnMethods = "LaunchChrome")
	public void login()
	{
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("pranit");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("kulkarni");
		driver.findElement(By.xpath("//button")).click();
	}
	
}
