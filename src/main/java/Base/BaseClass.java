package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static String URL = "https://demoqa.com/automation-practice-form";
	public static Actions act;
	public static WebDriver driver;

	@BeforeTest
	public static void Start() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		act = new Actions(driver);
		driver.manage().window().maximize();
	}
	
	@AfterTest	
	public static void End() 
	{
		driver.quit();
	}

}
