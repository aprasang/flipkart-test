package com.flipkart.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public  class DropdownMenu {
	
	public static void HandlingDropdownMenu(WebElement ddMenu,WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.moveToElement(ddMenu).perform();
	}

}
