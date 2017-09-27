package com.flipkart.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getSearchTextbox() {
		return driver.findElement(By.name("q"));
	}

	public WebElement getMyAccountLink() {
		return driver.findElement(By.xpath("//a[text()='My Account']"));
	}

	public WebElement getMyRewardsLink() {
		return driver.findElement(By.xpath("//a[contains(text(),'My Rewards')]"));
	}

	public WebElement getWishListLink() {
		return driver.findElement(By.xpath("//a[contains(text(),'Wishlist')]"));
	}

	public WebElement getReviewRatingLink() {
		return driver.findElement(By.xpath("//a[contains(text(),'Reviews & Ratings')]"));
	}

	public WebElement getWomenDropdownMenu() {
		return driver.findElement(By.xpath("//a[@title='Women']"));
	}

	public WebElement getLogoutButton() {
		return driver.findElement(By.xpath("//a[contains(text(),'Log Out')]"));
	}

	public WebElement getFlatLink() {
		return driver.findElement(By.xpath("//span[text()='Flats']"));
	}

	public void waithomePage() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@id='container']")));
	}
}
