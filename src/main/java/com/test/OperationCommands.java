package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.BaseClass;

public class OperationCommands extends BaseClass {
	
	@Test
public void TC1()
{   //SendKeys
	WebElement nameField=driver.findElement(By.xpath("//input[@id='firstName']"));
	nameField.sendKeys("Saurabh sagare");
	nameField.clear();
	nameField.sendKeys("new data");
//	WebElement nameField1=driver.findElement(By.id("//input[@gender-radio-1']"));
//	nameField1.click();
//	WebElement nameField2=driver.findElement(By.id("//input[@gender-radio-1']"));
	WebElement nameField1=driver.findElement(By.id("submit"));
	nameField1.click();

}
}
