package com.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.BaseClass;

public class handlewindows extends BaseClass 
{   @Test
	public void TC1() throws InterruptedException
	{
		driver.get("https://demoqa.com/browser-windows");
		WebElement DropMsgElement = driver.findElement(By.xpath("(//button[@id=\"tabButton\"]"));
		Set<String>Namesofallwindows=driver.getWindowHandles();
		for(String currentWin:Namesofallwindows)
		{
			driver.switchTo().window(currentWin);
			System.out.println("Window Handle :"+currentWin);
			Thread.sleep(3000);
			System.out.println("Window Title :"+driver.getCurrentUrl());
		}
	}
	

}
