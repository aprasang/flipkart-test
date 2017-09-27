package com.flipkart.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandlers {

	public static void selectOptionsbyIndex(WebElement ddl, int index)
	{
		Select sct=new Select(ddl);
		sct.selectByIndex(index);
	}
	
	public static void selectOptionsbyValue(WebElement ddl,String value)
	{
		Select sct=new Select(ddl);
		sct.selectByValue(value);
	}
	
	public static void selectOptionsbyVisibleText(WebElement ddl, String text)
	{
		Select sct=new Select(ddl);
		sct.selectByVisibleText(text);
	}
	
}
