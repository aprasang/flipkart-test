package com.flipkart.test.functional;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.test.config.TestConfiguration;
import com.flipkart.ui.HomePage;
import com.flipkart.ui.LoginPage;
import com.flipkart.utils.DropdownMenu;

public class TestHomePageActionsUS03 {

	static WebDriver driver;
	static HomePage home;
	static LoginPage login;

	@BeforeMethod
	public static void preConditions() {
		driver = TestConfiguration.createDriverInstance();
		home = new HomePage(driver);
		login = new LoginPage(driver);
	}

	@Test(priority=-1)
	public static void testRewardsTC01() {
		login.waitLoginPage();
		login.getLoginButton().click();

		login.getEmailTextbox().sendKeys("9160407241");
		login.getPasswordTextbox().sendKeys("ADI@335i");
		login.getSubmitButton().click();
		home.waithomePage();

		DropdownMenu.HandlingDropdownMenu(home.getMyAccountLink(), driver);
		home.getMyRewardsLink().click();
		DropdownMenu.HandlingDropdownMenu(home.getMyAccountLink(), driver);
		home.getLogoutButton();
	}

	@Test(priority = 0)
	public static void testWishListTC02() {
		login.waitLoginPage();
		login.getLoginButton().click();

		login.getEmailTextbox().sendKeys("9160407241");
		login.getPasswordTextbox().sendKeys("ADI@335i");
		login.getSubmitButton().click();
		home.waithomePage();

		DropdownMenu.HandlingDropdownMenu(home.getMyAccountLink(), driver);
		home.getWishListLink().click();
		DropdownMenu.HandlingDropdownMenu(home.getMyAccountLink(), driver);
		home.getLogoutButton();
	}

	@Test(priority = 1)
	public static void testRevengeTC03() {
		login.waitLoginPage();
		login.getLoginButton().click();

		login.getEmailTextbox().sendKeys("9160407241");
		login.getPasswordTextbox().sendKeys("ADI@335i");
		login.getSubmitButton().click();
		home.waithomePage();

		DropdownMenu.HandlingDropdownMenu(home.getMyAccountLink(), driver);
		home.getReviewRatingLink().click();
		home.waithomePage();
		DropdownMenu.HandlingDropdownMenu(home.getMyAccountLink(), driver);
		home.getLogoutButton();
	}

	@AfterMethod
	public static void postCondition() {
		driver.close();
	}
}
