package com.flipkart.test.functional;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.test.config.TestConfiguration;
import com.flipkart.ui.HomePage;
import com.flipkart.ui.LoginPage;
import com.flipkart.utils.DropdownMenu;

public class TestWomenDropdownMenuUS04 {

	
	static WebDriver driver;
	static HomePage home;
	static LoginPage login;

	@BeforeMethod
	public static void preConditions() {
		driver = TestConfiguration.createDriverInstance();
		home = new HomePage(driver);
		login = new LoginPage(driver);
	}
	
	@Test
	public static void testWomenFlatsTC01()
	{
		login.waitLoginPage();
		DropdownMenu.HandlingDropdownMenu(home.getWomenDropdownMenu(), driver);
	home.getFlatLink().click();
		
	}
	
	@AfterMethod
	public static void postCondition() {
		driver.close();
	}
}
