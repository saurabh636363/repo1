package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.BaseClass;

public class verificationcontrolmethods extends BaseClass {
@Test
public void TC1()
{
	WebElement PageTitle=driver.findElement(By.xpath("//h5"));
	System.out.println(PageTitle.isDisplayed());
	WebElement PageTitle1=driver.findElement(By.id("hobbies-checkbox-1"));
	System.out.println("Before Checking "+PageTitle1.isSelected());
	PageTitle1.click();
	System.out.println("Before Checking "+PageTitle1.isSelected());
}
}
