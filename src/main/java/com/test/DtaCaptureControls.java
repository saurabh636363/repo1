package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base.BaseClass;

public class DtaCaptureControls extends BaseClass{
	public void TC1()
	{
		WebElement PageTitle=driver.findElement(By.xpath("//h5"));
		String actualcolor=PageTitle.getCssValue("color");
		System.out.println(" Expected : #212529" + "Actual :" + actualcolor);
		System.out.println(PageTitle.getSize());
		System.out.println(PageTitle.getLocation());


	}
	
}
