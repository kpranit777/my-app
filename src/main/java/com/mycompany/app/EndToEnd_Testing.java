package com.mycompany.app;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndToEnd_Testing {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		KiteLogin_Page login = new KiteLogin_Page(driver);
		DashBoard_Page Dpage = new DashBoard_Page(driver);
		
		login.ClickLogin("LCM358" , "Zerodha.psk@777");
		login.ClickPin("117711");
		Dpage.WatchList();
	}

}
