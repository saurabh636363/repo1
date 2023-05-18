package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.BaseClass;

public class frameshandling extends BaseClass 
{
	@Test
	public void FrameHandling() throws InterruptedException
	{
		driver.get("https://letcode.in/frame");
		driver.switchTo().frame("firstFr");
		WebElement FirstName=driver.findElement(By.name("fname"));
		FirstName.sendKeys("Saurabh");
		
		WebElement LastName=driver.findElement(By.name("lname"));
		LastName.sendKeys("Sagare");
		
		WebElement Frameforemail=driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
        driver.switchTo().frame(Frameforemail);
        driver.findElement(By.name("email")).sendKeys("swaraj@12.com");
        
        driver.switchTo().parentFrame();
        FirstName.clear();
        Thread.sleep(5000);
        
        
		
		
	     
	}
	
}
