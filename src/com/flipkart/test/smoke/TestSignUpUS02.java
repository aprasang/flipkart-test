package com.flipkart.test.smoke;

import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.test.config.TestConfiguration;
import com.flipkart.ui.HomePage;
import com.flipkart.ui.LoginPage;

public class TestSignUpUS02 {
	static WebDriver driver;
	static LoginPage login;
	static HomePage home;

	@BeforeMethod
	public static void preCondition() {
		driver = TestConfiguration.createDriverInstance();
		login = new LoginPage(driver);
		home=new HomePage(driver);
	}
	
	@Test
	public static void testInvalidSignupTc01()
	{
		login.getSignupButton().click();
		login.getMobileNoTextbox().sendKeys("345345");
		login.getContinueButton().click();
		String actualerrMsg=login.getSignUpErrorMessage().getText();
		String ExpectederrMsg="Please enter a valid Mobile number";
		Assert.assertEquals(actualerrMsg, ExpectederrMsg);
	}
	
	@AfterMethod
	public static void postCondition()
	{
		driver.close();
	}
}
