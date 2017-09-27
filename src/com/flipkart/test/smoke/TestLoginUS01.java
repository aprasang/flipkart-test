package com.flipkart.test.smoke;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.test.config.TestConfiguration;
import com.flipkart.ui.LoginPage;
import com.flipkart.utils.DropdownMenu;
import com.flipkart.ui.HomePage;

public class TestLoginUS01 {
	static WebDriver driver;
	static LoginPage login;
	static HomePage home;

	@BeforeMethod
	public static void preCondition() {
		driver = TestConfiguration.createDriverInstance();
		login = new LoginPage(driver);
		home=new HomePage(driver);
	}

	@Test(priority=0)
	public static void testLoginValidTC01() {
		login.waitLoginPage();
		login.getLoginButton().click();

		login.getEmailTextbox().sendKeys("9160407241");
		login.getPasswordTextbox().sendKeys("ADI@335i");
		login.getSubmitButton().click();
		home.waithomePage();
		
		DropdownMenu.HandlingDropdownMenu(home.getMyAccountLink(), driver);
		home.getLogoutButton().click();		
		
	}
	@Test(priority=1)
	public static void testInValidLoginTC02() {
		login.waitLoginPage();
		login.getLoginButton().click();

		login.getEmailTextbox().sendKeys("123456789");
		login.getPasswordTextbox().sendKeys("dsfsd@34");
		login.getSubmitButton().click();
		String errorMsg="Please enter valid Email ID/Mobile number";
		String actualErrorMsg =	login.getErrorMessage().getText();
		
		Assert.assertEquals(actualErrorMsg, errorMsg);
		
	}
	@AfterMethod
	public static void postCondition()
	{
		driver.close();
	}
}
