package com.flipkart.test.config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.flipkart.utils.GetData;

public class TestConfiguration {
	
	public static WebDriver createDriverInstance()
	{
		WebDriver driver=null;
		String browser=GetData.FromProperties("Configuration","browser");
		String url=GetData.FromProperties("Configuration","url");
		
		if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.firefox.marionette", "./browser-drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./browser-drivers/chromedriver.exe");
			driver=new ChromeDriver();		
		}
		else
		{
			System.err.println("Invalid browser option");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
		return driver;
		
	}

}
