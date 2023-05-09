package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;



public class Base_Class {
	public WebDriver driver;
	@Parameters({"key","value"})
	@BeforeMethod
	public void openApp(String key,String value)
	{
    System.setProperty(key,value);
	 driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.get("https://demowebshop.tricentis.com/");
	}
	
	@AfterMethod
	public void closeApp()
	{
		driver.close();
	}
}
