package testng;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



@Test

public class practice {

 WebDriver driver;

 String baseurl = "https://demo.guru99.com/test/newtours/index.php";



 @BeforeClass

 public void setup() {

 // Write the code to launvh

 // baseurl="https://demo.guru99.com/test/newtours/index.php";

 driver = new ChromeDriver();

 WebDriverManager.chromedriver().setup();

    driver.manage().window().maximize();

 driver.get(baseurl);

 }

	

 public void test() {

 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("saurabh");

 }

 @AfterClass

 public void tearDowm() {

 driver.quit();

 }

	

}