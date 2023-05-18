package com.test;



import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Base.BaseClass;

public class toolsQA extends BaseClass {
 public static String GetData(String key) throws IOException {
 String Location = "/Users/SA20466287/eclipse-workspace/saurabh/Utilities/Broswer.properties";
File filePath = new File(Location);
FileInputStream fis = new FileInputStream(filePath);
 // Reading the data from prop file
Properties prop = new Properties();
 prop.load(fis);
 String data = prop.getProperty(key);
 return data;
 }
@Test
public void Tc1() throws IOException, InterruptedException {
driver.get("https://demoqa.com/automation-practice-form");
//driver.get("https://demoqa.com/automation-practice-form");
act.click(driver.findElement(By.id("firstName"))).sendKeys(GetData("UserName")).build().perform();
act.click(driver.findElement(By.id("lastName"))).sendKeys(GetData("LastName")).build().perform();
act.click(driver.findElement(By.xpath("//label[@for='gender-radio-1']"))).build().perform();
act.click(driver.findElement(By.id("userNumber"))).sendKeys(GetData("Mobile")).build().perform();
act.click(driver.findElement(By.id("userEmail"))).sendKeys(GetData("email")).build().perform();
act.click(driver.findElement(By.id("dateOfBirthInput"))).build().perform();
Select sm=new Select(driver.findElement(By.className("react-datepicker__month-select")));
sm.selectByVisibleText("June");
Select sl=new Select(driver.findElement(By.className("react-datepicker__year-select")));  
sl.selectByVisibleText("2000");
act.click(driver.findElement(By.xpath("//div[@class='react-datepicker__month']/div[2]/div[6]"))).build().perform();
act.click(driver.findElement(By.id("subjectsInput"))).sendKeys(GetData("subject")).build().perform();  
act.click(driver.findElement(By.xpath("//label[contains(@for,'ho')][1]"))).build().perform();
WebElement ResultData=driver.findElement(By.xpath("(//div[contains(@class,' css-1hwfws3')])[2]/div[2]/div/input"));
act.click(ResultData)
.sendKeys("Utt")
.pause(Duration.ofSeconds(5))
.sendKeys(Keys.ARROW_LEFT)
.sendKeys(Keys.ENTER)
.build()
.perform();
act.click(driver.findElement(By.id("currentAddress"))).sendKeys(GetData("Address")).build().perform();

//Thread.sleep(3000);


}

}

