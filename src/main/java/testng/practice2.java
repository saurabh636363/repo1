package testng;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Parameters;

import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;



public class practice2 {

 WebDriver driver;

 String url = "//www.google.com/";

 @Parameters({ "st1", "st2", "st3" })

 @Test (groups = "smoke")

 public void test(String str1, String str2, String str3) {

 
 driver = new ChromeDriver();

 WebDriverManager.chromedriver().setup();

 driver.manage().window().maximize();

 driver.get(url);

 driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(str1, str2, str3);

    

 }



}

