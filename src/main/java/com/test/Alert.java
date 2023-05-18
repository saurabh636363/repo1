package com.test;



import static org.testng.Assert.assertEquals;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import Base.BaseClass;



public class Alert extends BaseClass {

   @Test

   @Ignore

   public void TC1() {

      driver.get("https://demoqa.com/browser-windows/");

      WebElement newTabBtn = driver.findElement(By.id("tabButton"));

      newTabBtn.click();



      Set<String> listWebEle = driver.getWindowHandles();



      for (String ele : listWebEle) {

         driver.switchTo().window(ele);

         System.out.println("The title is " + driver.getCurrentUrl());

      }

   }



   @Test

//   @Ignore

   public void TC2() throws InterruptedException {

      driver.get("https://demoqa.com/alerts");



//      All the buttons

      WebElement alertBtn = driver.findElement(By.id("alertButton"));

      WebElement alertTimerBtn = driver.findElement(By.id("timerAlertButton"));

      WebElement alertConfirmBtn = driver.findElement(By.id("confirmButton"));

      WebElement alertPromptBtn = driver.findElement(By.id("promtButton"));



      alertBtn.click();

      Thread.sleep(3000);

      driver.switchTo().alert().accept();



      alertConfirmBtn.click();

      Thread.sleep(3000);

      driver.switchTo().alert().dismiss();

      String actualOp = driver.findElement(By.id("confirmResult")).getText();

      assertEquals(actualOp, "You selected Cancel");



      alertTimerBtn.click();

      Thread.sleep(6000);

      driver.switchTo().alert().accept();

      Thread.sleep(3000);



      alertPromptBtn.click();

      driver.switchTo().alert().sendKeys("Maverick");

      Thread.sleep(3000);

      driver.switchTo().alert().accept();

      String promptText = driver.findElement(By.id("promptResult")).getText();

      assertEquals(promptText, "You entered Maverick");



   }



}

