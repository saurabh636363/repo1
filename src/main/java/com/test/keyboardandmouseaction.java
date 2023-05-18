package com.test;



import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import Base.BaseClass;
//import BasePackage.baseClassTestNG;



public class keyboardandmouseaction extends BaseClass {

   @Test
   @Ignore
   public void dragAndDrop() {

      driver.get("https://demoqa.com/droppable");

      WebElement src = driver.findElement(By.id("draggable"));

      WebElement dest = driver.findElement(By.id("droppable"));

      act.dragAndDrop(src, dest).build().perform();

      WebElement p = driver.findElement(By.xpath("//div[@id='droppable']/p"));

      String content = p.getText();

      assertEquals(content, "Dropped!");

   }


   @Test
   @Ignore
   public void scrollingPage() {



   }



   @Test

   @Ignore

   public void readToolTip() {

      driver.get("https://demoqa.com/tool-tips");

      WebElement hoverBtn = driver.findElement(By.id("toolTipButton"));

      act.moveToElement(hoverBtn).pause(Duration.ofMillis(3000)).build().perform();

      String toolTipContent = driver.findElement(By.className("tooltip-inner")).getText();

      assertEquals(toolTipContent, "You hovered over the Button");

   }



   @Test

   @Ignore

   public void rightClick() {

      driver.get("https://demoqa.com/links");

      WebElement link = driver.findElement(By.xpath("//a[@id='simpleLink']"));

      act.contextClick(link).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

   }


   @Test
   @Ignore
   public void doubleClick() {

      driver.get("https://demoqa.com/buttons");

      WebElement doubleBtn = driver.findElement(By.id("doubleClickBtn"));

      act.doubleClick(doubleBtn).build().perform();

      WebElement resText = driver.findElement(By.id("doubleClickMessage"));

      assertEquals(resText.getText(), "You have done a double click");

   }



   @Test
   @Ignore
   public void sendingDataInCapsOn() {



   }



   @Test
   @Ignore
   public void holdAndRelease() {

      driver.get("https://demoqa.com/droppable");

      WebElement src = driver.findElement(By.id("draggable"));

      WebElement dest = driver.findElement(By.id("droppable"));

      act.clickAndHold(src).release(dest).build().perform();

      WebElement content = driver.findElement(By.xpath("//div[@id='droppable']/p"));

      assertEquals(content, "Dropped!");

   }



}

