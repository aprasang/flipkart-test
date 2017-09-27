package com.flipkart.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	WebDriver driver;
   
   public LoginPage(WebDriver driver)
   {
	   this.driver=driver;
   }
   
   public WebElement getLoginButton()
   {
	   return driver.findElement(By.xpath("//a[text()='Log In']"));
   }
   
   public WebElement getEmailTextbox()
   {
	   return driver.findElement(By.xpath("//input[@class='_2zrpKA']"));
   }
   
   public WebElement getPasswordTextbox()
   {
	   return driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv']"));
   }
    
   
   public WebElement getSubmitButton()
   {
	   return driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']"));
   }
   
   public WebElement getErrorMessage()
   {
	   return driver.findElement(By.xpath("//span[@class='ZAtlA-']"));
   } 
   
   public WebElement getSignupButton()
   {
	   return driver.findElement(By.xpath("//a[text()='Signup']"));
   } 
   
   public WebElement getMobileNoTextbox()
   {
	   return driver.findElement(By.xpath("//input[@class='_2zrpKA']"));
   } 
   
   public WebElement getContinueButton()
   {
	   return driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']"));
   } 
   
   public WebElement getSignUpErrorMessage()
   {
	   return driver.findElement(By.xpath("//span[@class='ZAtlA-']"));
   } 
   
   
   public void waitLoginPage()
   {
	   WebDriverWait wait=new WebDriverWait(driver,30);
	   wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@class='_3Ji-EC']")));
   } 

}
