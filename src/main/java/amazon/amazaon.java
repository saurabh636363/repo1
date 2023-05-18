package amazon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazaon 
{
	public static String URL = "https://www.amazon.in/";
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		Thread.sleep(3000);
		String XpathUser="//i[@class='hm-icon nav-sprite']";
		 driver.findElement(By.xpath(XpathUser)).click();
		 String XpathUser1="//a[@class='hmenu-item']";
		 driver.findElement(By.xpath(XpathUser1)).click();

   	 
   	     
	
	}
}
