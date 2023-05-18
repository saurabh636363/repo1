 package com.test;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.BaseClass;
public class wait extends BaseClass {
 @Test
 public void TC() {

 driver.get("https://www.speedtest.net/");

 WebElement SpdBtn=driver.findElement(By.xpath("//span[@class='start-text']"));

 SpdBtn.click();

 //Expicit Wait

 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-result-id='true']")));
 WebElement ResultData=driver.findElement(By.xpath("//div[@data-result-id='true']"));
 String ResultID=ResultData.getText();
 System.out.println(ResultID);

   

 }



}

